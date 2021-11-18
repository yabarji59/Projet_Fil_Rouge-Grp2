import { HttpResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Former } from 'src/app/model/Former.model';
import { Program } from 'src/app/model/Program.model';
import { Session } from 'src/app/model/Session.model';
import { FormerService } from 'src/app/services/Former.service';
import { ProgramService } from 'src/app/services/Program.service';
import { SessionService } from 'src/app/services/Session.service';

@Component({
  selector: 'app-session-form',
  templateUrl: './session-form.component.html',
  styleUrls: ['./session-form.component.css'],
})
export class SessionFormComponent implements OnInit {
  formers: Former[];
  programs: Program[];

  validateForm!: FormGroup;
  editMode = false;
  paramId: string;

  submitForm(): void {
    if (this.validateForm.valid) {
      console.log(this.validateForm.value);
      let session: Session = {
        formerSession: null,
        programSession: null,
        sessionTitle: this.validateForm.value.sessionTitle,
      };
      if (this.validateForm.value.formerId) {
        this.formerService
          .find(this.validateForm.value.formerId)
          .subscribe((res: HttpResponse<Session>) => {
            if (res.status === 200) {
              session.formerSession = res.body;
              if (this.validateForm.value.programId) {
                this.programService
                  .find(this.validateForm.value.programId)
                  .subscribe((res: HttpResponse<Session>) => {
                    if (res.status === 200) {
                      session.programSession = res.body;
                      console.log(session);

                      if (this.editMode) {
                        console.log(session);
                        session.sessionId = this.paramId;
                        this.sessionService
                          .update(session)
                          .subscribe((res: HttpResponse<Session>) => {
                            if (res.status === 200) {
                              this.router.navigate(['/session']);
                            }
                          });
                      } else {
                        this.sessionService
                          .create(session)
                          .subscribe((res: HttpResponse<Session>) => {
                            if (res.status === 200) {
                              this.router.navigate(['/session']);
                            }
                          });
                      }
                    }
                  });
              }
            }
          });
      }
    } else {
      Object.values(this.validateForm.controls).forEach((control) => {
        if (control.invalid) {
          control.markAsDirty();
          control.updateValueAndValidity({ onlySelf: true });
        }
      });
    }
  }

  constructor(
    private fb: FormBuilder,
    private sessionService: SessionService,
    private formerService: FormerService,
    private programService: ProgramService,
    private router: Router,
    private route: ActivatedRoute
  ) {
    this.getFormers();
    this.getPrograms();
    console.log(this.route.snapshot.paramMap.get('id'));
    this.paramId = this.route.snapshot.paramMap.get('id');
    if (this.paramId != null) {
      this.editMode = true;
      this.sessionService
        .find(this.paramId)
        .subscribe((res: HttpResponse<Session>) => {
          if (res.status === 200) {
            const session = res.body;
            this.validateForm.controls['sessionTitle'].setValue(
              session.sessionTitle
            );
            this.validateForm.controls['formerId'].setValue(
              session?.formerSession?.formerId
            );
            this.validateForm.controls['programId'].setValue(
              session?.programSession?.programId
            );
          }
        });
    }
  }
  getFormers(): void {
    this.formerService.findAll().subscribe((res: HttpResponse<Former[]>) => {
      this.formers = res.body;
    });
  }
  getPrograms(): void {
    this.programService.findAll().subscribe((res: HttpResponse<Program[]>) => {
      this.programs = res.body;
    });
  }

  ngOnInit(): void {
    this.validateForm = this.fb.group({
      sessionTitle: [null, [Validators.required]],
      formerId: [null, [Validators.required]],
      programId: [null, [Validators.required]],
    });
  }
}

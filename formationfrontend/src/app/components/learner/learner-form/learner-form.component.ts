import { HttpResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Learner } from 'src/app/model/Learner.model';
import { Session } from 'src/app/model/Session.model';
import { LearnerService } from 'src/app/services/Learner.service';
import { SessionService } from 'src/app/services/Session.service';

@Component({
  selector: 'app-learner-form',
  templateUrl: './learner-form.component.html',
  styleUrls: ['./learner-form.component.css'],
})
export class LearnerFormComponent implements OnInit {
  sessions: Session[];
  learner:Learner[];
  validateForm!: FormGroup;
  editMode = false;
  paramId: string;

  submitForm(): void {
    if (this.validateForm.valid) {
      console.log('form valid');
      if (this.editMode) {
        let learner: Learner = this.validateForm.value;
        learner.learnerId = this.route.snapshot.paramMap.get('id');
        this.learnerService
          .createOrUpdate(learner)
          .subscribe((res: HttpResponse<Learner>) => {
            if (res.status === 200) {
              this.router.navigate(['/learner']);
            }
          });
      } else {
        this.learnerService
          .createOrUpdate(this.validateForm.value)
          .subscribe((res: HttpResponse<Learner>) => {
            if (res.status === 200) {
              this.router.navigate(['/learner']);
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
    private learnerService: LearnerService,
    private sessionService: SessionService,
    private router: Router,
    private route: ActivatedRoute
  ) {
    this.getSessions();

    console.log(this.route.snapshot.paramMap.get('id'));
    this.paramId = this.route.snapshot.paramMap.get('id');
    if (this.paramId != null) {
      this.editMode = true;
      this.learnerService
        .find(this.paramId)
        .subscribe((res: HttpResponse<Learner>) => {
          if (res.status === 200) {
            const learner = res.body;
            this.validateForm.controls['learnerName'].setValue(
              learner.learnerName
            );
            this.validateForm.controls['learnerFirstname'].setValue(
              learner.learnerFirstname
            );
            this.validateForm.controls['sessionTitle'].setValue(
              learner.learnerSession.sessionTitle
            );
          }
        });
    }
  }
  getSessions(): void {
    this.sessionService.findAll().subscribe((res: HttpResponse<Session[]>) => {
      this.sessions = res.body;
    });
  }
  ngOnInit(): void {
    this.validateForm = this.fb.group({
      learnerName: [null, [Validators.required]],
      learnerFirstname: [null, [Validators.required]],
      sessionTitle: [null, [Validators.required]],
    });
  }
}

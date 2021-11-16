import { HttpResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Program } from 'src/app/model/Program.model';
import { ProgramService } from 'src/app/services/Program.service';

@Component({
  selector: 'app-program-form',
  templateUrl: './program-form.component.html',
  styleUrls: ['./program-form.component.css'],
})
export class ProgramFormComponent implements OnInit {
  validateForm!: FormGroup;
  editMode = false;
  paramId: string;

  submitForm(): void {
    if (this.validateForm.valid) {
      console.log('form valid');
      if (this.editMode) {
        let program: Program = this.validateForm.value;
        program.programId = this.route.snapshot.paramMap.get('id');
        this.programService
          .update(program)
          .subscribe((res: HttpResponse<Program>) => {
            if (res.status === 200) {
              this.router.navigate(['/program']);
            }
          });
      } else {
        this.programService
          .create(this.validateForm.value)
          .subscribe((res: HttpResponse<Program>) => {
            if (res.status === 200) {
              this.router.navigate(['/program']);
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
    private programService: ProgramService,
    private router: Router,
    private route: ActivatedRoute
  ) {
    console.log(this.route.snapshot.paramMap.get('id'));
    this.paramId = this.route.snapshot.paramMap.get('id');
    if (this.paramId != null) {
      this.editMode = true;
      this.programService
        .find(this.paramId)
        .subscribe((res: HttpResponse<Program>) => {
          if (res.status === 200) {
            const program = res.body;
            this.validateForm.controls['programDescription'].setValue(
              program.programDescription
            );
            this.validateForm.controls['programTitle'].setValue(
              program.programTitle
            );
          }
        });
    }
  }

  ngOnInit(): void {
    this.validateForm = this.fb.group({
      programDescription: [null, [Validators.required]],
      programTitle: [null, [Validators.required]],
    });
  }
}

import { HttpResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Program } from 'src/app/model/Program.model';
import { ProgramService } from 'src/app/services/Program.service';

@Component({
  selector: 'app-program-form',
  templateUrl: './program-form.component.html',
  styleUrls: ['./program-form.component.css'],
})
export class ProgramFormComponent implements OnInit {
  validateForm!: FormGroup;
  inputValue?: string;

  submitForm(): void {
    if (this.validateForm.valid) {
      console.log('form valid');
      this.programService
        .create(this.validateForm.value)
        .subscribe((res: HttpResponse<Program>) => {
          if (res.status === 200) {
            this.router.navigate(['/program']);
          }
        });
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
    private router: Router
  ) {}

  ngOnInit(): void {
    this.validateForm = this.fb.group({
      programDescription: [null, [Validators.required]],
      programTitle: [null, [Validators.required]],
    });
  }
}

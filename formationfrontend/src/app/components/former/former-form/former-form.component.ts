import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-former-form',
  templateUrl: './former-form.component.html',
  styleUrls: ['./former-form.component.css'],
})
export class FormerFormComponent implements OnInit {
  validateForm!: FormGroup;

  submitForm(): void {
    console.log('submit', this.validateForm);
    if (this.validateForm.valid) {
      console.log('form valid');
    } else {
      Object.values(this.validateForm.controls).forEach((control) => {
        if (control.invalid) {
          control.markAsDirty();
          control.updateValueAndValidity({ onlySelf: true });
        }
      });
    }
  }

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
    this.validateForm = this.fb.group({
      surname: [null, [Validators.required]],
      name: [null, [Validators.required]],
    });
  }
}

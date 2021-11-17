import { HttpResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Former } from 'src/app/model/Former.model';
import { FormerService } from 'src/app/services/Former.service';

@Component({
  selector: 'app-former-form',
  templateUrl: './former-form.component.html',
  styleUrls: ['./former-form.component.css'],
})
export class FormerFormComponent implements OnInit {
  validateForm!: FormGroup;
  editMode = false;
  paramId: string;

  submitForm(): void {
    if (this.validateForm.valid) {
      console.log('form valid');
      if (this.editMode) {
        let former: Former = this.validateForm.value;
        former.formerId = this.route.snapshot.paramMap.get('id');
        this.formerService
          .update(former)
          .subscribe((res: HttpResponse<Former>) => {
            if (res.status === 200) {
              this.router.navigate(['/former']);
            }
          });
      } else {
        this.formerService
          .create(this.validateForm.value)
          .subscribe((res: HttpResponse<Former>) => {
            if (res.status === 200) {
              this.router.navigate(['/former']);
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
    private formerService: FormerService,
    private router: Router,
    private route: ActivatedRoute
  ) {
    console.log(this.route.snapshot.paramMap.get('id'));
    this.paramId = this.route.snapshot.paramMap.get('id');
    if (this.paramId != null) {
      this.editMode = true;
      this.formerService
        .find(this.paramId)
        .subscribe((res: HttpResponse<Former>) => {
          if (res.status === 200) {
            const former = res.body;
            this.validateForm.controls['formerName'].setValue(
              former.formerName
            );
            this.validateForm.controls['formerLastname'].setValue(
              former.formerLastname
            );
          }
        });
    }
  }

  ngOnInit(): void {
    this.validateForm = this.fb.group({
      formerName: [null, [Validators.required]],
      formerLastname: [null, [Validators.required]],
    });
  }
}

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LearnerFormComponent } from './learner-form.component';

describe('LearnerFormComponent', () => {
  let component: LearnerFormComponent;
  let fixture: ComponentFixture<LearnerFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LearnerFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LearnerFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

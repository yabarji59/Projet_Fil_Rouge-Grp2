import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormerFormComponent } from './former-form.component';

describe('FormerFormComponent', () => {
  let component: FormerFormComponent;
  let fixture: ComponentFixture<FormerFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormerFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormerFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

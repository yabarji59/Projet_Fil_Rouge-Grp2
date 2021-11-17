import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FormerFormComponent } from './components/former/former-form/former-form.component';
import { FormerListComponent } from './components/former/former-list/former-list.component';
import { LearnerFormComponent } from './components/learner/learner-form/learner-form.component';
import { LearnerListComponent } from './components/learner/learner-list/learner-list.component';
import { ProgramDetailComponent } from './components/program/program-detail/program-detail.component';
import { ProgramFormComponent } from './components/program/program-form/program-form.component';
import { ProgramListComponent } from './components/program/program-list/program-list.component';
import { LoginComponent } from './components/security/login/login.component';
import { SessionDetailComponent } from './components/session/session-detail/session-detail.component';
import { SessionFormComponent } from './components/session/session-form/session-form.component';
import { SessionListComponent } from './components/session/session-list/session-list.component';

const routes: Routes = [
  { path: 'session', component: SessionListComponent },
  { path: 'session-edit', component: SessionFormComponent },
  { path: 'session-edit/:id', component: SessionFormComponent },
  { path: 'session-detail/:id', component: SessionDetailComponent },
  { path: 'session-edit/:id', component: SessionDetailComponent },
  { path: 'former', component: FormerListComponent },
  { path: 'former-edit', component: FormerFormComponent },
  { path: 'former-edit/:id', component: FormerFormComponent },
  { path: 'learner', component: LearnerListComponent },
  { path: 'learner-edit', component: LearnerFormComponent },
  { path: 'learner-edit/:id', component: LearnerFormComponent },
  { path: 'program', component: ProgramListComponent },
  { path: 'program-edit', component: ProgramFormComponent },
  { path: 'program-edit/:id', component: ProgramFormComponent },
  { path: 'program-detail/:id', component: ProgramDetailComponent },
  { path: 'program-edit/:id', component: ProgramDetailComponent },
  { path: 'login', component: LoginComponent },
  { path: '', pathMatch: 'full', redirectTo: '/session' },
  { path: '**', pathMatch: 'full', redirectTo: '/session' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

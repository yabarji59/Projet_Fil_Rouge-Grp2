import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FormerFormComponent } from './components/former/former-form/former-form.component';
import { FormerListComponent } from './components/former/former-list/former-list.component';
import { LearnerFormComponent } from './components/learner/learner-form/learner-form.component';
import { LearnerListComponent } from './components/learner/learner-list/learner-list.component';
import { ProgramFormComponent } from './components/program/program-form/program-form.component';
import { ProgramListComponent } from './components/program/program-list/program-list.component';
import { SessionFormComponent } from './components/session/session-form/session-form.component';
import { SessionListComponent } from './components/session/session-list/session-list.component';

const routes: Routes = [
  { path: 'session', component: SessionListComponent },
  { path: 'session-edit', component: SessionFormComponent },
  { path: 'session-edit/:id', component: SessionFormComponent },
  { path: 'former', component: FormerListComponent },
  { path: 'former-edit', component: FormerFormComponent },
  { path: 'former-edit/:id', component: FormerFormComponent },
  { path: 'learner', component: LearnerListComponent },
  { path: 'learner-edit', component: LearnerFormComponent },
  { path: 'learner-edit/:id', component: LearnerFormComponent },
  { path: 'program', component: ProgramListComponent },
  { path: 'program-edit', component: ProgramFormComponent },
  { path: 'program-edit/:id', component: ProgramFormComponent },
  { path: '', pathMatch: 'full', redirectTo: '/session' },
  { path: '**', pathMatch: 'full', redirectTo: '/session' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

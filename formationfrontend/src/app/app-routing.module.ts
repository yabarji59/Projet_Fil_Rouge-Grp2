import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FormerListComponent } from './components/former/former-list/former-list.component';
import { LearnerFormComponent } from './components/learner/learner-form/learner-form.component';
import { LearnerListComponent } from './components/learner/learner-list/learner-list.component';
import { ProgramListComponent } from './components/program/program-list/program-list.component';
import { SessionListComponent } from './components/session/session-list/session-list.component';

const routes: Routes = [
  { path: 'session', component: SessionListComponent },
  { path: 'former', component: FormerListComponent },
  { path: 'learner', component: LearnerListComponent },
  { path: 'learner-edit', component: LearnerFormComponent },
  { path: 'learner-edit/:id', component: LearnerFormComponent },
  { path: 'program', component: ProgramListComponent },
  { path: '', pathMatch: 'full', redirectTo: '/session' },
  { path: '**', pathMatch: 'full', redirectTo: '/session' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

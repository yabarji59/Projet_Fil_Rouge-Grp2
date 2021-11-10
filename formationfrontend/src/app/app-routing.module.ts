import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FormerListComponent } from './components/former/former-list/former-list.component';
import { LearnerListComponent } from './components/learner/learner-list/learner-list.component';
import { ProgramListComponent } from './components/program/program-list/program-list.component';
import { SessionListComponent } from './components/session/session-list/session-list.component';

const routes: Routes = [
  
  { path: 'session', component: SessionListComponent },
  { path: 'session', pathMatch: 'full', redirectTo: '/session' },
  { path: 'former', component: FormerListComponent },
  { path: 'former', pathMatch: 'full', redirectTo: '/former' },
  { path: 'learner', component: LearnerListComponent },
  { path: 'learner', pathMatch: 'full', redirectTo: '/learner' },
  { path: 'program', component: ProgramListComponent },
  { path: 'program', pathMatch: 'full', redirectTo: '/program' },
  { path: '', pathMatch: 'full', redirectTo: '/welcome' },
  { path: 'welcome', loadChildren: () => import('./pages/welcome/welcome.module').then(m => m.WelcomeModule) }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

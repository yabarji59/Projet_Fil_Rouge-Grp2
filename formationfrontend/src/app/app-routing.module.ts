import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FormerListComponent } from './components/former/former-list/former-list.component';
import { LearnerListComponent } from './components/learner/learner-list/learner-list.component';
import { ProgramListComponent } from './components/program/program-list/program-list.component';
import { SessionListComponent } from './components/session/session-list/session-list.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: '/welcome' },
  { path: 'session', component: SessionListComponent },
  { path: 'session', pathMatch: 'full', redirectTo: '/session' },
  { path: 'formateur', component: FormerListComponent },
  { path: 'formateur', pathMatch: 'full', redirectTo: '/formateur' },
  { path: 'apprenant', component: LearnerListComponent },
  { path: 'apprenant', pathMatch: 'full', redirectTo: '/apprenant' },
  { path: 'programme', component: ProgramListComponent },
  { path: 'programme', pathMatch: 'full', redirectTo: '/programme' },
  { path: 'welcome', loadChildren: () => import('./pages/welcome/welcome.module').then(m => m.WelcomeModule) }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/security/login/login.component';
import { SessionListComponent } from './components/session/session-list/session-list.component';
import { ProgramListComponent } from './components/program/program-list/program-list.component';
import { SessionDetailComponent } from './components/session/session-detail/session-detail.component';
import { SessionFormComponent } from './components/session/session-form/session-form.component';
import { ProgramDetailComponent } from './components/program/program-detail/program-detail.component';
import { ProgramFormComponent } from './components/program/program-form/program-form.component';
import { LearnerListComponent } from './components/learner/learner-list/learner-list.component';
import { LearnerFormComponent } from './components/learner/learner-form/learner-form.component';
import { FormerListComponent } from './components/former/former-list/former-list.component';
import { FormerFormComponent } from './components/former/former-form/former-form.component';
import { AppRoutingModule } from './app-routing.module';
import { NZ_I18N } from 'ng-zorro-antd/i18n';
import { fr_FR } from 'ng-zorro-antd/i18n';
import { registerLocaleData } from '@angular/common';
import fr from '@angular/common/locales/fr';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { IconsProviderModule } from './icons-provider.module';
import { NzLayoutModule } from 'ng-zorro-antd/layout';
import { NzMenuModule } from 'ng-zorro-antd/menu';

registerLocaleData(fr);

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SessionListComponent,
    ProgramListComponent,
    SessionDetailComponent,
    SessionFormComponent,
    ProgramDetailComponent,
    ProgramFormComponent,
    LearnerListComponent,
    LearnerFormComponent,
    FormerListComponent,
    FormerFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    IconsProviderModule,
    NzLayoutModule,
    NzMenuModule
  ],
  providers: [{ provide: NZ_I18N, useValue: fr_FR }],
  bootstrap: [AppComponent]
})
export class AppModule { }

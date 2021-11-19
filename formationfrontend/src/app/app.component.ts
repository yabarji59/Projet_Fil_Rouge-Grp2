import { Component } from '@angular/core';
import { NavigationEnd, Router } from '@angular/router';
import { filter } from 'rxjs/operators';
import { User } from './model/User.model';
import { AuthenticationService } from './services/AuthenticationService';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  isCollapsed = false;
  currentUrl: string;
  currentUser: User;

  constructor(private router: Router ,private authenticationService: AuthenticationService) {
    this.authenticationService.currentUser.subscribe(x => this.currentUser = x);
    router.events
      .pipe(filter((event) => event instanceof NavigationEnd))
      .subscribe((event) => {
        this.currentUrl = event['urlAfterRedirects'];
        console.log(this.currentUrl != '/login');
      });
  }
  logout() {
    this.authenticationService.logout();
    this.router.navigate(['/login']);
}
}

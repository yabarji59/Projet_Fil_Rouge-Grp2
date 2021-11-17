import { HttpResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Session } from 'src/app/model/Session.model';
import { SessionService } from 'src/app/services/Session.service';
@Component({
  selector: 'app-session-list',
  templateUrl: './session-list.component.html',
  styleUrls: ['./session-list.component.css'],
})
export class SessionListComponent implements OnInit {
  sessions: Session[];
  sessionOriginal: Session[];

  filterSession($event: KeyboardEvent): void {
    const filter = ($event.target as HTMLTextAreaElement).value.toLowerCase();
    this.sessions = this.sessionOriginal.filter((session) =>
      session.sessionTitle.toLowerCase().includes(filter)
    );
  }

  constructor(private sessionService: SessionService) {
    this.getSessions();
  }

  ngOnInit(): void {}

  getSessions(): void {
    this.sessionService.findAll().subscribe((res: HttpResponse<Session[]>) => {
      this.sessions = res.body;
      this.sessionOriginal = this.sessions;
    });
  }

  delete(id: string): void {
    this.sessionService.delete(id).subscribe((res: HttpResponse<any>) => {
      console.log(res.status);
      if (res.status === 200) {
        this.getSessions();
      }
    });
  }
}

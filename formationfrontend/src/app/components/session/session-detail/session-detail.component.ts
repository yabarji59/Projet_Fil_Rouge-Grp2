import { HttpResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Learner } from 'src/app/model/Learner.model';
import { Session } from 'src/app/model/Session.model';
import { LearnerService } from 'src/app/services/Learner.service';
import { SessionService } from 'src/app/services/Session.service';

@Component({
  selector: 'app-session-detail',
  templateUrl: './session-detail.component.html',
  styleUrls: ['./session-detail.component.css']
})
export class SessionDetailComponent implements OnInit {
  paramId: string;
  session: Session;
  learners: Learner[];

    
  constructor(
    private learnerService: LearnerService,
    private sessionService: SessionService,
    private router: Router,
    private route: ActivatedRoute) {
    console.log(this.route.snapshot.paramMap.get('id'));
    this.paramId = this.route.snapshot.paramMap.get('id');
    if (this.paramId != null) {
      this.sessionService
        .find(this.paramId).subscribe((res: HttpResponse<Session>) => {
          this.session = res.body;
          
        });
        
        this.sessionService
        .findLearners(this.paramId).subscribe((res: HttpResponse<Learner[]>) => {
          
          this.session.learnersSession =res.body;
        });
    }
   }

  ngOnInit(): void {
  }

}

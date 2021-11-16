import { HttpResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Learner } from 'src/app/model/Learner.model';
import { LearnerService } from 'src/app/services/Learner.service';

@Component({
  selector: 'app-learner-list',
  templateUrl: './learner-list.component.html',
  styleUrls: ['./learner-list.component.css'],
})
export class LearnerListComponent implements OnInit {
  learners: Learner[];
  learnersOriginal: Learner[];

  filterLearner($event: KeyboardEvent): void {
    const filter = ($event.target as HTMLTextAreaElement).value.toLowerCase();
    this.learners = this.learnersOriginal.filter((learner) =>
      learner.learnerFirstname.toLowerCase().includes(filter)
    );
  }
  constructor(private learnerService: LearnerService) {
    this.learnerService.findAll().subscribe((res: HttpResponse<Learner[]>) => {
      this.learners = res.body;
      this.learnersOriginal = this.learners;
    });
  }
  ngOnInit(): void {}
}

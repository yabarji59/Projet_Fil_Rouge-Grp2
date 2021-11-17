import { HttpResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Program } from 'src/app/model/Program.model';
import { ProgramService } from 'src/app/services/Program.service';

@Component({
  selector: 'app-program-detail',
  templateUrl: './program-detail.component.html',
  styleUrls: ['./program-detail.component.css']
})
export class ProgramDetailComponent implements OnInit {

  paramId: string;
  program: Program;
    
  constructor(
    private programService: ProgramService,
    private router: Router,
    private route: ActivatedRoute) {
    console.log(this.route.snapshot.paramMap.get('id'));
    this.paramId = this.route.snapshot.paramMap.get('id');
    if (this.paramId != null) {
      this.programService
        .find(this.paramId).subscribe((res: HttpResponse<Program>) => {
          this.program = res.body;
        });
    }
   }

  ngOnInit(): void {
  }

}

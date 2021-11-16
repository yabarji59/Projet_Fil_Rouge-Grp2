import { HttpResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Program } from 'src/app/model/Program.model';
import { ProgramService } from 'src/app/services/Program.service';

@Component({
  selector: 'app-program-list',
  templateUrl: './program-list.component.html',
  styleUrls: ['./program-list.component.css'],
})
export class ProgramListComponent implements OnInit {
  programs: Program[];
  programsOriginal: Program[];

  filterProgram($event: KeyboardEvent): void {
    const filter = ($event.target as HTMLTextAreaElement).value.toLowerCase();
    this.programs = this.programsOriginal.filter((program) =>
      program.programTitle.toLowerCase().includes(filter)
    );
  }
  constructor(private programService: ProgramService) {
    this.programService.findAll().subscribe((res: HttpResponse<Program[]>) => {
      this.programs = res.body;
      this.programsOriginal = this.programs;
    });
  }

  ngOnInit(): void {}
}

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
    this.getPrograms();
  }

  ngOnInit(): void {}

  getPrograms(): void {
    this.programService.findAll().subscribe((res: HttpResponse<Program[]>) => {
      this.programs = res.body;
      this.programsOriginal = this.programs;
    });
  }

  delete(id: string): void {
    this.programService.delete(id).subscribe((res: HttpResponse<any>) => {
      console.log(res.status);
      if (res.status === 200) {
        this.getPrograms();
      }
    });
  }
}

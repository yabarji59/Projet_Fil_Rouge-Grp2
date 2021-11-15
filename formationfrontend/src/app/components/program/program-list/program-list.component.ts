import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-program-list',
  templateUrl: './program-list.component.html',
  styleUrls: ['./program-list.component.css'],
})
export class ProgramListComponent implements OnInit {
  programs = [
    {
      id: '1',
      session: {
        name: 'POEI JAVA',
      },
      program: {
        title: 'Programme Java',
        description:
          "Un programme Java est composé d'un ou plus généralement plusieurs fichiers source. N'importe quel éditeur de texte peut être utilisé pour éditer un fichier source Java. Il est nécessaire de compiler le source pour le transformer en J-code ou bytecode Java qui sera lui exécuté par la machine virtuelle",
      },
    },
  ];
  submitForm(): void {}
  filterProgram($event: KeyboardEvent): void {
    const filter = ($event.target as HTMLTextAreaElement).value.toLowerCase();
    this.programs = this.programs.filter(
      (program) => program.session.name === filter
    );
  }
  constructor() {}

  ngOnInit(): void {}
}

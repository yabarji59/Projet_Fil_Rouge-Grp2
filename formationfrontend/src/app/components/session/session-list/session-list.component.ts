import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-session-list',
  templateUrl: './session-list.component.html',
  styleUrls: ['./session-list.component.css'],
})
export class SessionListComponent implements OnInit {
  sessions = [
    {
      id: '1',
      name: 'POEI JAVA',
      former: {
        name: 'yassen',
        surname: 'abarji',
      },
      listLearners: {
        name: 'Wendy',
        surname: 'vandenberghe',
      },
      program: {
        title: 'programme java angular',
        description:
          'ceci est un program java fort interessant Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eleifend velit nulla, non maximus erat dictum in. Donec auctor porta dolor, eu egestas mi facilisis vitae. Maecenas in imperdiet eros. Ut nec eros neque. Phasellus dictum dolor magna, nec scelerisque nibh rhoncus non. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris eget magna a sem maximus vulputate. Proin quam massa, eleifend eu ultricies luctus, tristique in neque.',
      },
    },
  ];
  submitForm(): void {}
  filterSession($event: KeyboardEvent): void {
    const filter = ($event.target as HTMLTextAreaElement).value.toLowerCase();
    this.sessions = this.sessions.filter((session) => session.name === filter);
  }
  constructor() {}

  ngOnInit(): void {}
}

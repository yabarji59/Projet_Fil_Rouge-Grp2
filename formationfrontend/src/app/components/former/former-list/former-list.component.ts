import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-former-list',
  templateUrl: './former-list.component.html',
  styleUrls: ['./former-list.component.css'],
})
export class FormerListComponent implements OnInit {
  formers = [
    {
      id: '1',
      name: 'Yassen',
      surname: 'Abarji',
      session: {
        name: 'POEI JAVA',
        learners: {
          name: 'Wendy',
          surname: 'Vandenberghe',
        },
      },
      program: {
        title: 'programme java angular',
        description:
          'ceci est un program java fort interessant Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eleifend velit nulla, non maximus erat dictum in. Donec auctor porta dolor, eu egestas mi facilisis vitae. Maecenas in imperdiet eros. Ut nec eros neque. Phasellus dictum dolor magna, nec scelerisque nibh rhoncus non. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris eget magna a sem maximus vulputate. Proin quam massa, eleifend eu ultricies luctus, tristique in neque.',
      },
    },
  ];

  submitForm(): void {}
  constructor() {}

  ngOnInit(): void {}
}

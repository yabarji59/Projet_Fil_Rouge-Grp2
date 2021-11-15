import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-learner-list',
  templateUrl: './learner-list.component.html',
  styleUrls: ['./learner-list.component.css'],
})
export class LearnerListComponent implements OnInit {
  learners = [
    {
      id: '1',
      name: 'Wendy',
      surname: 'Vandenberghe',
      session: {
        name: 'POEI JAVA',
        former: {
          name: 'yassen',
          surname: 'abarji',
        },
      },
      program: {
        title: 'programme java angular',
        description:
          'ceci est un program java fort interessant Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eleifend velit nulla, non maximus erat dictum in. Donec auctor porta dolor, eu egestas mi facilisis vitae. Maecenas in imperdiet eros. Ut nec eros neque. Phasellus dictum dolor magna, nec scelerisque nibh rhoncus non. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris eget magna a sem maximus vulputate. Proin quam massa, eleifend eu ultricies luctus, tristique in neque.',
      },
    },
    {
      id: '2',
      name: 'Maïa',
      surname: 'Verdier',
      session: {
        name: 'POEI JAVA',
        former: {
          name: 'yassen',
          surname: 'abarji',
        },
      },
      program: {
        title: 'programme java angular',
        description:
          'ceci est un program java fort interessant Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eleifend velit nulla, non maximus erat dictum in. Donec auctor porta dolor, eu egestas mi facilisis vitae. Maecenas in imperdiet eros. Ut nec eros neque. Phasellus dictum dolor magna, nec scelerisque nibh rhoncus non. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris eget magna a sem maximus vulputate. Proin quam massa, eleifend eu ultricies luctus, tristique in neque.',
      },
    },
    {
      id: '3',
      name: 'Virginie',
      surname: 'Finez',
      session: {
        name: 'POEI JAVA',
        former: {
          name: 'yassen',
          surname: 'abarji',
        },
      },
      program: {
        title: 'programme java angular',
        description:
          'ceci est un program java fort interessant Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eleifend velit nulla, non maximus erat dictum in. Donec auctor porta dolor, eu egestas mi facilisis vitae. Maecenas in imperdiet eros. Ut nec eros neque. Phasellus dictum dolor magna, nec scelerisque nibh rhoncus non. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris eget magna a sem maximus vulputate. Proin quam massa, eleifend eu ultricies luctus, tristique in neque.',
      },
    },
    {
      id: '4',
      name: 'Karima',
      surname: 'Saidani',
      session: {
        name: 'POEI JAVA',
        former: {
          name: 'yassen',
          surname: 'abarji',
        },
      },
      program: {
        title: 'programme java angular',
        description:
          'ceci est un program java fort interessant Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eleifend velit nulla, non maximus erat dictum in. Donec auctor porta dolor, eu egestas mi facilisis vitae. Maecenas in imperdiet eros. Ut nec eros neque. Phasellus dictum dolor magna, nec scelerisque nibh rhoncus non. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris eget magna a sem maximus vulputate. Proin quam massa, eleifend eu ultricies luctus, tristique in neque.',
      },
    },
    {
      id: '5',
      name: 'Caroline',
      surname: 'Peter',
      session: {
        name: 'POEI JAVA',
        former: {
          name: 'yassen',
          surname: 'abarji',
        },
      },
      program: {
        title: 'programme java angular',
        description:
          'ceci est un program java fort interessant Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eleifend velit nulla, non maximus erat dictum in. Donec auctor porta dolor, eu egestas mi facilisis vitae. Maecenas in imperdiet eros. Ut nec eros neque. Phasellus dictum dolor magna, nec scelerisque nibh rhoncus non. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris eget magna a sem maximus vulputate. Proin quam massa, eleifend eu ultricies luctus, tristique in neque.',
      },
    },
    {
      id: '6',
      name: 'Cecile',
      surname: 'Simon',
      session: {
        name: 'POEI JAVA',
        former: {
          name: 'yassen',
          surname: 'abarji',
        },
      },
      program: {
        title: 'programme java angular',
        description:
          'ceci est un program java fort interessant Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eleifend velit nulla, non maximus erat dictum in. Donec auctor porta dolor, eu egestas mi facilisis vitae. Maecenas in imperdiet eros. Ut nec eros neque. Phasellus dictum dolor magna, nec scelerisque nibh rhoncus non. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris eget magna a sem maximus vulputate. Proin quam massa, eleifend eu ultricies luctus, tristique in neque.',
      },
    },
    {
      id: '7',
      name: 'Mireille Charline',
      surname: 'Abuwe',
      session: {
        name: 'POEI JAVA',
        former: {
          name: 'yassen',
          surname: 'abarji',
        },
      },
      program: {
        title: 'programme java angular',
        description:
          'ceci est un program java fort interessant Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eleifend velit nulla, non maximus erat dictum in. Donec auctor porta dolor, eu egestas mi facilisis vitae. Maecenas in imperdiet eros. Ut nec eros neque. Phasellus dictum dolor magna, nec scelerisque nibh rhoncus non. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris eget magna a sem maximus vulputate. Proin quam massa, eleifend eu ultricies luctus, tristique in neque.',
      },
    },
    {
      id: '8',
      name: 'Justine',
      surname: 'Lemaire',
      session: {
        name: 'POEI JAVA',
        former: {
          name: 'yassen',
          surname: 'abarji',
        },
      },
      program: {
        title: 'programme java angular',
        description:
          'ceci est un program java fort interessant Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eleifend velit nulla, non maximus erat dictum in. Donec auctor porta dolor, eu egestas mi facilisis vitae. Maecenas in imperdiet eros. Ut nec eros neque. Phasellus dictum dolor magna, nec scelerisque nibh rhoncus non. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris eget magna a sem maximus vulputate. Proin quam massa, eleifend eu ultricies luctus, tristique in neque.',
      },
    },
    {
      id: '9',
      name: 'Amira',
      surname: 'Nsangou',
      session: {
        name: 'POEI JAVA',
        former: {
          name: 'yassen',
          surname: 'abarji',
        },
      },
      program: {
        title: 'programme java angular',
        description:
          'ceci est un program java fort interessant Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eleifend velit nulla, non maximus erat dictum in. Donec auctor porta dolor, eu egestas mi facilisis vitae. Maecenas in imperdiet eros. Ut nec eros neque. Phasellus dictum dolor magna, nec scelerisque nibh rhoncus non. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris eget magna a sem maximus vulputate. Proin quam massa, eleifend eu ultricies luctus, tristique in neque.',
      },
    },
    {
      id: '10',
      name: 'Alexandra',
      surname: 'Hall',
      session: {
        name: 'POEI JAVA',
        former: {
          name: 'yassen',
          surname: 'abarji',
        },
      },
      program: {
        title: 'programme java angular',
        description:
          'ceci est un program java fort interessant Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eleifend velit nulla, non maximus erat dictum in. Donec auctor porta dolor, eu egestas mi facilisis vitae. Maecenas in imperdiet eros. Ut nec eros neque. Phasellus dictum dolor magna, nec scelerisque nibh rhoncus non. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris eget magna a sem maximus vulputate. Proin quam massa, eleifend eu ultricies luctus, tristique in neque.',
      },
    },
    {
      id: '11',
      name: 'Arwa',
      surname: 'EL Kaabi',
      session: {
        name: 'POEI JAVA',
        former: {
          name: 'yassen',
          surname: 'abarji',
        },
      },
      program: {
        title: 'programme java angular',
        description:
          'ceci est un program java fort interessant Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eleifend velit nulla, non maximus erat dictum in. Donec auctor porta dolor, eu egestas mi facilisis vitae. Maecenas in imperdiet eros. Ut nec eros neque. Phasellus dictum dolor magna, nec scelerisque nibh rhoncus non. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris eget magna a sem maximus vulputate. Proin quam massa, eleifend eu ultricies luctus, tristique in neque.',
      },
    },
    {
      id: '12',
      name: 'Sabrine',
      surname: 'Khemici',
      session: {
        name: 'POEI JAVA',
        former: {
          name: 'yassen',
          surname: 'abarji',
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

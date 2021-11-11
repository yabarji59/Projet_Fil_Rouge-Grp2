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
      name: 'wendy',
      surname: 'vandenberghe',
      session: {
        name: 'poe java ee',
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
      name: 'test1',
      surname: 'test2',
      session: {
        name: 'POE javascript',
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
      name: 'wendy',
      surname: 'vandenberghe',
      session: {
        name: 'poe java ee',
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
      name: 'wendy',
      surname: 'vandenberghe',
      session: {
        name: 'poe java ee',
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
      name: 'wendy',
      surname: 'vandenberghe',
      session: {
        name: 'poe java ee',
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
      name: 'wendy',
      surname: 'vandenberghe',
      session: {
        name: 'poe java ee',
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
      name: 'wendy',
      surname: 'vandenberghe',
      session: {
        name: 'poe java ee',
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
      name: 'wendy',
      surname: 'vandenberghe',
      session: {
        name: 'poe java ee',
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
      name: 'wendy',
      surname: 'vandenberghe',
      session: {
        name: 'poe java ee',
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
      name: 'wendy',
      surname: 'vandenberghe',
      session: {
        name: 'poe java ee',
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
      name: 'wendy',
      surname: 'vandenberghe',
      session: {
        name: 'poe java ee',
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
      name: 'wendy',
      surname: 'vandenberghe',
      session: {
        name: 'poe java ee',
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
      name: 'wendy',
      surname: 'vandenberghe',
      session: {
        name: 'poe java ee',
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

  constructor() {}

  ngOnInit(): void {}
}

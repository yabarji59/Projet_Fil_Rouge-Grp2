import { HttpResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Former } from 'src/app/model/Former.model';
import { FormerService } from 'src/app/services/Former.service';

@Component({
  selector: 'app-former-list',
  templateUrl: './former-list.component.html',
  styleUrls: ['./former-list.component.css'],
})
export class FormerListComponent implements OnInit {
  formers: Former[];
  formersOriginal: Former[];

  filterFormer($event: KeyboardEvent): void {
    const filter = ($event.target as HTMLTextAreaElement).value.toLowerCase();
    this.formers = this.formersOriginal.filter((former) =>
      former.formerName.toLowerCase().includes(filter)
    );
  }
  constructor(private formerService: FormerService) {
    this.formerService.findAll().subscribe((res: HttpResponse<Former[]>) => {
      this.formers = res.body;
      this.formersOriginal = this.formers;
      console.log(this.formers);
    });
  }
  ngOnInit(): void {}
}

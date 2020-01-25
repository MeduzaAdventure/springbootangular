import { Component, OnInit } from '@angular/core';
import {IncomesService} from "../incomes.service";
import {Income} from "../income";

@Component({
  selector: 'app-incomes-list',
  templateUrl: './incomes-list.component.html',
  styleUrls: ['./incomes-list.component.css']
})
export class IncomesListComponent implements OnInit {

  incomes: Income[];
  constructor(private incomesService: IncomesService) { }

  ngOnInit() {
    this.incomesService.findAll().subscribe(data => {
      this.incomes = data;
    });
  }

}

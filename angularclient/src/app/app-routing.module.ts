import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {IncomesListComponent} from "./incomes-list/incomes-list.component";


const routes: Routes = [
  { path: 'incomes', component: IncomesListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

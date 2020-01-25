import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IncomesListComponent } from './incomes-list/incomes-list.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {IncomesService} from "./incomes.service";

@NgModule({
  declarations: [
    AppComponent,
    IncomesListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [IncomesService],
  bootstrap: [AppComponent]
})
export class AppModule { }

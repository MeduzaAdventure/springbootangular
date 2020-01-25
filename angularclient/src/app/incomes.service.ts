import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Income} from "./income";

@Injectable({providedIn: 'root'})
export class IncomesService {
  private incomesUrl: string;
  constructor(private http: HttpClient) {
    this.incomesUrl = '//localhost:8080/incomes';
  }
  public findAll(): Observable<Income[]> {
    return this.http.get<Income[]>(this.incomesUrl);
  }
}

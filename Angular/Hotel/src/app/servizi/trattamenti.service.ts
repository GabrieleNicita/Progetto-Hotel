import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Trattamento } from '../interfacce/Trattamento';

@Injectable({
  providedIn: 'root'
})
export class TrattamentiService {

  private trattamentoURL: string;

  constructor(private http: HttpClient) {
    this.trattamentoURL = 'http://localhost:8080/trattamento/';
  }

  public trattamenti(): Observable<any[]>{
    return this.http.get<Trattamento[]>(this.trattamentoURL);
  }

}

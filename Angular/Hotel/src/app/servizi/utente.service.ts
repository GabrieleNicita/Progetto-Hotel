import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class UtenteService {

  private utenteURL: string;

  constructor(private http: HttpClient) {
    this.utenteURL = 'http://localhost:8080/user/';
  }

  public regUtente(datiU:any): Observable<any>{
    const headers={'content-type':'application/json'} 
    return this.http.post<any>(this.utenteURL+'add',JSON.stringify(datiU),{'headers':headers});
  }
}

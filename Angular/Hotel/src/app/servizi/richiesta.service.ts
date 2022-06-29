import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RichiestaService {

  private utenteURL: string;

  constructor(private http: HttpClient) {
    this.utenteURL = 'http://localhost:8080/prenota/';
  }

  public ricPernott(reqPern:any,trattamento:number){
    const headers={'content-type':'application/json'} 
    this.http.post<any>(this.utenteURL+'add/'+trattamento,JSON.stringify(reqPern),{'headers':headers}).subscribe();
  }
}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Prenotazione } from '../interfacce/Prenotazione';

@Injectable({
  providedIn: 'root'
})
export class PrenotazioneService {

  private prenotazioneURL: string;

  constructor(private http: HttpClient) {
    this.prenotazioneURL = 'http://localhost:8080/prenota/';
  }

  public prenotazioni(): Observable<any[]>{
    return this.http.get<Prenotazione[]>(this.prenotazioneURL);
  }

  public disdetta(){
    
  }
}

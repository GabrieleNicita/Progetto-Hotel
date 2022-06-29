import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TipoCamera } from '../interfacce/TipoCamera';

@Injectable({
  providedIn: 'root'
})

export class TipoStanzaService {

  private tipocameraURL: string;

  constructor(private http: HttpClient) {
    this.tipocameraURL = 'http://localhost:8080/camera/tipo';
  }

  public tuttiTipi(): Observable<TipoCamera[]> {
    return this.http.get<TipoCamera[]>(this.tipocameraURL);
  }
}

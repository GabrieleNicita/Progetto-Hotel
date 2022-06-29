import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient} from '@angular/common/http';
import { Camera } from '../interfacce/Camera';


@Injectable({
  providedIn: 'root'
})
export class CameraService {

  private cameraURL: string;

  constructor(private http: HttpClient) {
    this.cameraURL = 'http://localhost:8080/camera/';
  }

  public cLibere(formC:any): Observable<any[]>{
    const headers={'content-type':'application/json'} 
    return this.http.post<Camera[]>(this.cameraURL+'libere',JSON.stringify(formC),{'headers':headers});
  }
   
}

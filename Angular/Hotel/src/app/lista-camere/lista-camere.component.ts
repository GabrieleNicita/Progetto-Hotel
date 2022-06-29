import { Component,Output,EventEmitter} from '@angular/core';
import { CameraService, } from '../servizi/camera.service';
import { TrattamentiService } from '../servizi/trattamenti.service';
import { Camera } from '../interfacce/Camera';
import { Trattamento } from '../interfacce/Trattamento';
import { Router } from '@angular/router';



@Component({
  selector: 'app-lista-camere',
  templateUrl: './lista-camere.component.html',
  styleUrls: ['./lista-camere.component.css']
})
export class ListaCamereComponent {

  @Output() eventoS=new EventEmitter<any>()

  submitF=false
  richiestaForm:any
  camereL:Camera[]=new Array()
  trattamento:Trattamento[]=new Array()
  camera:any
  dataTipo:any

    risForm(camDisp:any){
      this.submitF=true;
      const vet=new Map()

      for (let as in camDisp )
      {
        vet.set([as],camDisp[as])
      }
      this.dataTipo=Object.fromEntries(vet)

      this.cameraSer.cLibere(camDisp).subscribe(c =>{this.camereL=c}); 
      this.tratServ.trattamenti().subscribe(tr =>{(this.trattamento=tr)});
    }

    constructor(private cameraSer:CameraService ,private tratServ:TrattamentiService,private route:Router){}

    selTra(tipoTrattamento:Trattamento){
      const formCamera={
        dataTipo:this.dataTipo,
        tipoTrattamento
       };
       
      this.eventoS.emit(formCamera)   

    }
}

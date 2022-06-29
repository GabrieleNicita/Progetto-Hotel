import { Component} from '@angular/core';
import { Router } from '@angular/router';
import { RichiestaService } from '../servizi/richiesta.service';
import { UtenteService } from '../servizi/utente.service';

@Component({
  selector: 'app-resoconto',
  templateUrl: './resoconto.component.html',
  styleUrls: ['./resoconto.component.css']
})
export class ResocontoComponent {
  contr=true
  contr1=true
  final=true

  prenot:any
  utente:any
  camera:any
  richiesta:any

  constructor(private usrService:UtenteService,private reqService:RichiestaService,private rout:Router) {

    this.camera={
      inizio:Date,
      fine:Date,
      tipoCamera:String,
      trattamento:String,
      prezzo:String
    }

    this.utente={
      nome:String,
      cognome:String,
      telefono:String,
      email:String
    }
    
  }


  tipoC(itemC:any){
    this.contr=false
    const vet=new Map()
    for (let as in itemC )
      {
        vet.set([as],itemC[as])
      }
      this.prenot=Object.fromEntries(vet)
      console.log()
      this.camera.prezzo=(this.prenot['dataTipo'].tipo.prezzo+this.prenot['tipoTrattamento'].prezzo)*(this.prenot['dataTipo'].tipo['composizione'].nPersone)

      this.camera.tipoCamera=this.prenot['dataTipo'].tipo.composizione.tipoComp
      this.camera.trattamento=this.prenot['tipoTrattamento'].tipo
      this.camera.inizio=this.prenot['dataTipo'].inizio    
      this.camera.fine=this.prenot['dataTipo'].fine    
      
  }

  formU(itmU:any){
    this.contr1=false
    const vet=new Map()
    for (let as in itmU )
      {
        vet.set([as],itmU[as])
      }
      this.utente=Object.fromEntries(vet)
  }

  subResoconto(){
    
    let richiesta={
      dataRichiesta:this.prenot['dataTipo'].oggi,
      inizio:this.camera.inizio,
      fine:this.camera.fine,
      tipo:this.prenot['dataTipo'].tipo,
      utente:{idUtente:Number}
      
    }

    
    this.usrService.regUtente(this.utente).subscribe( u=>{
      richiesta['utente'].idUtente=u.idUtente
      this.reqService.ricPernott(richiesta,this.prenot['tipoTrattamento'].idTrattamento)
      this.final=false
    })

  }  

  }

  
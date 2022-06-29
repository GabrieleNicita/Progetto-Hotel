import { Component } from '@angular/core';
import { Prenotazione } from '../interfacce/Prenotazione';
import { PrenotazioneService } from '../servizi/prenotazione.service';

@Component({
  selector: 'app-prenotazioni',
  templateUrl: './prenotazioni.component.html',
  styleUrls: ['./prenotazioni.component.css']
})
export class PrenotazioniComponent{

  prenotazione:Prenotazione[]= new Array()
  

  constructor(private prenSer:PrenotazioneService) { 
    this.prenSer.prenotazioni().subscribe( p=>{(this.prenotazione=p)})

  }



}

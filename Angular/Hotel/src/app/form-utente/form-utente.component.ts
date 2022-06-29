import { Component, EventEmitter, Output, Type} from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';



@Component({
  selector: 'app-form-utente',
  templateUrl: './form-utente.component.html',
  styleUrls: ['./form-utente.component.css']
})
export class FormUtenteComponent{
  
  @Output() subForm= new EventEmitter<any>()

  formUtente:FormGroup;
  conr=true
  
  constructor(private fb:FormBuilder,private route:Router) {
  

    this.formUtente=this.fb.group({
      nome:['mario',Validators.required],
      cognome:['rossi',Validators.required],
      telefono:['+39..',Validators.required],
      email:['ss@gg',Validators.required]
    })
  }


  

  formSub(){
    this.subForm.emit(this.formUtente.value)
  }

}

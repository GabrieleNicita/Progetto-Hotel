import { DatePipe } from '@angular/common';
import { Component,Output,EventEmitter} from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { TipoStanzaService } from '../servizi/tipo-stanza.service';

@Component({
  selector: 'app-form-pernottamento',
  templateUrl: './form-pernottamento.component.html',
  styleUrls: ['./form-pernottamento.component.css']
})

export class FormPernottamentoComponent{

  @Output() event= new EventEmitter<FormGroup>()

  oggi:Date;
  formData:FormGroup
  tipo_camera:any
  pipe:DatePipe
  
  constructor(private fb:FormBuilder,private tipoCamereService:TipoStanzaService){
  
    this.tipoCamereService.tuttiTipi().subscribe(tc =>{ this.tipo_camera=tc})
    
    this.oggi=new Date()
    this.pipe=new DatePipe('en-US')
    this.formData = this.fb.group({

      oggi:[this.pipe.transform(this.oggi, 'YYYY-MM-dd'),Validators.required],
      inizio: [this.pipe.transform(this.oggi, 'YYYY-MM-dd'), Validators.required],
      fine: [this.pipe.transform(this.oggi, 'YYYY-MM-dd'),Validators.required],
      tipo:[Validators.required]

      })

    }

    formSub(){
      this.event.emit(this.formData.value)
    }
}

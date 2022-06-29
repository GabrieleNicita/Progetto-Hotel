import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { FormPernottamentoComponent } from './form-pernottamento/form-pernottamento.component';
import { ListaCamereComponent } from './lista-camere/lista-camere.component';
import { FormUtenteComponent } from './form-utente/form-utente.component';
import { ResocontoComponent } from './resoconto/resoconto.component';
import { PrenotazioniComponent } from './prenotazioni/prenotazioni.component';
import { HomepageComponent } from './homepage/homepage.component';



@NgModule({
  declarations: [
    AppComponent,
    FormPernottamentoComponent,
    ListaCamereComponent,
    FormUtenteComponent,
    ResocontoComponent,
    PrenotazioniComponent,
    HomepageComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { PrenotazioniComponent } from './prenotazioni/prenotazioni.component';
import { ResocontoComponent } from './resoconto/resoconto.component';

const routes: Routes = [
  {path: 'home',component:HomepageComponent},
  {path: 'home/prenota',component:ResocontoComponent},
  {path: 'home/prenotazioni',component:PrenotazioniComponent},
  { path: '',redirectTo: '/home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

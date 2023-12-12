import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeutenteComponent } from './homeutente/homeutente.component';
import { OrariutenteComponent } from './orariutente/orariutente.component';

const routes: Routes = [
  {path: 'home', component: HomeutenteComponent},
  {path: 'orari', component: OrariutenteComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

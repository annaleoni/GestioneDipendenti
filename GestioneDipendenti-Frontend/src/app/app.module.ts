import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarutenteComponent } from './navbarutente/navbarutente.component';
import { HomeutenteComponent } from './homeutente/homeutente.component';
import { OrariutenteComponent } from './orariutente/orariutente.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarutenteComponent,
    HomeutenteComponent,
    OrariutenteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }

import { Component, OnInit } from '@angular/core';
import { UtentiService } from 'src/app/services/utenti.service';

@Component({
  selector: 'app-utenti',
  templateUrl: './utenti.component.html',
  styleUrls: ['./utenti.component.css']
})
export class UtentiComponent implements OnInit {
utenti: any = [];
username: any;

constructor(private utentiSrv: UtentiService){}

ngOnInit(): void {
  this.username = localStorage.getItem('username');
  console.log(this.username);
  this.getAllUtenti();
}

getAllUtenti(){
  this.utentiSrv.getAllUtenti().subscribe(
    utenti => {
      this.utenti = utenti;
    },
    error => {
      console.error('Errore durante il recupero degli utenti: ', error);
    }
  );
}

}

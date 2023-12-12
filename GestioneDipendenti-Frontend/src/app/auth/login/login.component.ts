import { Component } from '@angular/core';
import { AuthService } from '../auth.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username: string = '';
  password: string = '';

  constructor(private authService: AuthService) {}

  login() {
    // Chiamata al metodo login del servizio AuthService
    this.authService.login(this.username, this.password).subscribe(success => {
      if (success) {
        console.log('Login successful');

      } else {
        console.error('Login failed');

      }
    });
  }
}

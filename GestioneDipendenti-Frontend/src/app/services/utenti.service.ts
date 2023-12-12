import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/enviroments/enviroment';

@Injectable({
  providedIn: 'root'
})
export class UtentiService {
  baseUrl = environment.baseURL;

  constructor(private http: HttpClient) { }

  getAllUtenti(): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}utenti`);
  }

  saveUser(formData: FormData){
    return this.http.post<any>(`${this.baseUrl}utenti/user`, formData);
  }

  saveAdmin(formData: FormData){
    return this.http.post<any>(`${this.baseUrl}utenti/admin`, formData);
  }

  updateUser(userId: number, payload: any): Observable<any> {
    return this.http.put<any>(`${this.baseUrl}utenti/${userId}`, payload);
  }

  deleteUser(userId: number) {
    return this.http.delete(`${this.baseUrl}utenti/${userId}`);
  }
}

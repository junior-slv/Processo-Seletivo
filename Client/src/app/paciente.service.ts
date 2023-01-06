import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Paciente } from './paciente';
import { environment } from 'src/Environments/enviroment';

@Injectable({
  providedIn: 'root'
})

export class PacienteService{
    private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) {}

  public getPacientes(): Observable<Paciente[]>{
      return this.http.get<Paciente[]>(`${this.apiServerUrl}/paciente/todos`);

  }   

  public addPacientes(paciente: Paciente): Observable<Paciente> {
    return this.http.post<Paciente>(`${this.apiServerUrl}/paciente/adicionar`, paciente);
  }

  public updatePacientes(paciente: Paciente): Observable<Paciente> {
    return this.http.put<Paciente>(`${this.apiServerUrl}/paciente/atualizar`, paciente);
  }

  public deletePacientes(idPaciente: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/paciente/deletar/${idPaciente}`);
  } 
}
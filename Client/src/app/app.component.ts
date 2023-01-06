import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Paciente } from './paciente';
import { PacienteService } from './paciente.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  public pacientes: Paciente[];

  constructor(private pacienteService: PacienteService){}

  ngOnInit(): void {
      this.getPacientes();
  }

  public getPacientes(): void{
    this.pacienteService.getPacientes().subscribe(
      (response: Paciente[]) => {
        this.pacientes = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  }
  public onDeletePaciente(pacienteId: number): void {
    this.pacienteService.deletePacientes(pacienteId).subscribe(
      (response: void) => {
        console.log(response);
        this.getPacientes();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}

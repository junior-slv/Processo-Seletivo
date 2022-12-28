package com.processo.processoseletivo;

import com.processo.processoseletivo.model.Paciente;
import com.processo.processoseletivo.model.repo.service.PacientesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteResource {
    private final PacientesService pacientesService;

    public PacienteResource(PacientesService pacientesService) {
        this.pacientesService = pacientesService;
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Paciente>> getAllPacientes (){
        List<Paciente> pacientes = pacientesService.findAllPacientes();
        return new ResponseEntity<>(pacientes, HttpStatus.OK);
    }
    @GetMapping("/pesquisa/{id}")
    public ResponseEntity<List<Paciente>> getPacienteById (@PathVariable("id") Long id){
        Paciente paciente = pacientesService.findPacienteById(id);
        return new ResponseEntity<>(paciente, HttpStatus.OK);
    }
}

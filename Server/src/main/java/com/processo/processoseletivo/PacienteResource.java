package com.processo.processoseletivo;

import com.processo.processoseletivo.model.Paciente;
import com.processo.processoseletivo.model.repo.service.PacientesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Paciente> getPacienteById (@PathVariable("id") Long id){
        Paciente paciente = pacientesService.findPacienteById(id);
        return new ResponseEntity<>(paciente, HttpStatus.OK);
    }

    @PostMapping("/adicionar")
    public ResponseEntity<Paciente> addPaciente(@RequestBody Paciente paciente){
        Paciente newPaciente = pacientesService.addPaciente(paciente);
        return new ResponseEntity<>(newPaciente, HttpStatus.CREATED);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Paciente> updatePaciente(@RequestBody Paciente paciente){
        Paciente updatePaciente = pacientesService.updatePaciente(paciente);
        return new ResponseEntity<>(updatePaciente, HttpStatus.OK);
    }

    @PutMapping("/deletar/{id}")
    public ResponseEntity<?> deletePaciente(@PathVariable("id") Long id){
        pacientesService.deletePaciente(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

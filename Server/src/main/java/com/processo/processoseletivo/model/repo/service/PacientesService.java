package com.processo.processoseletivo.model.repo.service;

import com.processo.processoseletivo.model.Paciente;
import com.processo.processoseletivo.model.repo.PacientesRepo;
import com.processo.processoseletivo.model.repo.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PacientesService {
    private final PacientesRepo pacientesRepo;

    @Autowired
    public PacientesService(PacientesRepo pacientesRepo) {
        this.pacientesRepo = pacientesRepo;
    }

    public Paciente addPaciente(Paciente paciente){
        paciente.setPacienteCodigo(UUID.randomUUID().toString());
        return pacientesRepo.save(paciente);
    }

    public List<Paciente> findAllPacientes(){
        return pacientesRepo.findAll();
    }
    public Paciente updatePaciente(Paciente paciente){
        return pacientesRepo.save(paciente);
    }
    public Paciente findPacienteById(Long id){
        return pacientesRepo.findPacienteById(id)
                .orElseThrow(() -> new UserNotFoundException("Paciente de identificação "+id+" não foi encontrado" ));
    }
    public void deletePaciente(Long id){
        pacientesRepo.deletePacienteById(id);
    }
}

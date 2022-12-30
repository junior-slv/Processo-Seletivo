package com.processo.processoseletivo.model.repo;

import com.processo.processoseletivo.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PacientesRepo extends JpaRepository<Paciente, Long> {
    void deletePacienteById(Long id);

    Optional<Paciente> findPacienteById(Long id);
}

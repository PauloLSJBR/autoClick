package org.una.empresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.una.empresa.domain.Funcionario;

public interface FuncionarioRepositoryJPA extends JpaRepository<Funcionario, Long> {
}

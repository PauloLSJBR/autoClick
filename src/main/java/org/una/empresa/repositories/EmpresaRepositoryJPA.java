package org.una.empresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.una.empresa.domain.Empresa;

@Repository
public interface EmpresaRepositoryJPA extends JpaRepository<Empresa, Long> {

}

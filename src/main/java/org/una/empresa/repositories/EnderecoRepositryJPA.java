package org.una.empresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.una.empresa.domain.Endereco;

@Repository
public interface EnderecoRepositryJPA extends JpaRepository<Endereco, Long> {

}


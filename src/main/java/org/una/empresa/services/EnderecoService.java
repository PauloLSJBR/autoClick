package org.una.empresa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.una.empresa.domain.Endereco;
import org.una.empresa.exceptions.EnderecoNotFoundException;
import org.una.empresa.repositories.EnderecoRepositryJPA;
import org.una.empresa.services.interfaces.EnderecoServiceAPI;

import java.util.List;

public class EnderecoService implements EnderecoServiceAPI {

    @Autowired
    private EnderecoRepositryJPA repositoryJPA;

    @Transactional(readOnly = true)
    @Override
    public Endereco get(Long id) {
        try {
            Endereco endereco = repositoryJPA.findById(id).get();
            return endereco;
        } catch (Exception ex) {
            throw new EnderecoNotFoundException(String.format("Não exite Endereco com esse id: %s ", id));
        }
    }

    @Transactional(readOnly = true)
    @Override
    public List<Endereco> findAll() {
        return repositoryJPA.findAll();
    }

    @Transactional(readOnly = false)
    @Override
    public Endereco create(Endereco endereco) {
        return repositoryJPA.save(endereco);
    }

    @Transactional(readOnly = false)
    @Override
    public void update(Endereco endereco) {
        repositoryJPA.save(endereco);
    }

    @Transactional(readOnly = false)
    @Override
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }

}

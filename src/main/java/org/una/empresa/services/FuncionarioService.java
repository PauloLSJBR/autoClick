package org.una.empresa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.una.empresa.domain.Endereco;
import org.una.empresa.domain.Funcionario;
import org.una.empresa.exceptions.EnderecoNotFoundException;
import org.una.empresa.repositories.FuncionarioRepositoryJPA;
import org.una.empresa.services.interfaces.FuncionarioServiceAPI;

import java.util.List;

public class FuncionarioService implements FuncionarioServiceAPI {

    @Autowired
    private FuncionarioRepositoryJPA repositoryJPA;

    @Transactional(readOnly = true)
    @Override
    public Funcionario get(Long id) {
        try {
            Funcionario endereco = repositoryJPA.findById(id).get();
            return endereco;
        } catch (Exception ex) {
            throw new EnderecoNotFoundException(String.format("Não exite Endereco com esse id: %s ", id));
        }
    }

    @Transactional(readOnly = true)
    @Override
    public List<Funcionario> findAll() {
        return repositoryJPA.findAll();
    }

    @Transactional(readOnly = false)
    @Override
    public Funcionario create(Funcionario funcionario) {
        return repositoryJPA.save(funcionario);
    }

    @Transactional(readOnly = false)
    @Override
    public void update(Funcionario funcionario) {
        repositoryJPA.save(funcionario);
    }

    @Transactional(readOnly = false)
    @Override
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }

}

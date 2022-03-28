package org.una.empresa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.empresa.domain.Empresa;
import org.una.empresa.exceptions.EmpresaNotFoundException;
import org.una.empresa.repositories.EmpresaRepositoryJPA;
import org.una.empresa.services.interfaces.EmpresaServiceAPI;

import java.util.List;

@Service
public class EmpresaService implements EmpresaServiceAPI {

    @Autowired
    private EmpresaRepositoryJPA repositoryJPA;

    @Transactional(readOnly = true)
    @Override
    public Empresa get(Long id) {
        try {
            Empresa empresa = repositoryJPA.findById(id).get();
            return empresa;
        } catch (Exception ex) {
            throw new EmpresaNotFoundException(String.format("Não exite Empresa com esse id: %s ", id));
        }
    }

    @Transactional(readOnly = true)
    @Override
    public List<Empresa> findAll() {
        return repositoryJPA.findAll();
    }

    @Transactional(readOnly = false)
    @Override
    public Empresa create(Empresa empresa) {
        return repositoryJPA.save(empresa);
    }

    @Transactional(readOnly = false)
    @Override
    public void update(Empresa empresa) {
        repositoryJPA.save(empresa);
    }

    @Transactional(readOnly = false)
    @Override
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }
}

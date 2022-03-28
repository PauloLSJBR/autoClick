package org.una.empresa.services.interfaces;
import org.una.empresa.domain.Empresa;

import java.util.List;

public interface EmpresaServiceAPI {

    public Empresa get(Long id);

    public List<Empresa> findAll();

    public Empresa create(Empresa empresa);

    public void update(Empresa empresa);

    public void remove(Long id);
}

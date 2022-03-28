package org.una.empresa.services.interfaces;

import org.una.empresa.domain.Endereco;

import java.util.List;

public interface EnderecoServiceAPI {
    public Endereco get(Long id);

    public List<Endereco> findAll();

    public Endereco create(Endereco endereco);

    public void update(Endereco endereco);

    public void remove(Long id);
}

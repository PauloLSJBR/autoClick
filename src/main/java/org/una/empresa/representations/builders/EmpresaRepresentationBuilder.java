package org.una.empresa.representations.builders;

import org.una.empresa.representations.EmpresaRepresentation;
import org.una.empresa.representations.FuncionarioRepresentation;

import java.util.List;

public class EmpresaRepresentationBuilder {

    private EmpresaRepresentation representation = new EmpresaRepresentation();

    public EmpresaRepresentationBuilder funcionarios(List<FuncionarioRepresentation> funcionarios) {
        representation.setFuncionarios(funcionarios);
        return this;
    }

    public EmpresaRepresentationBuilder id(Long id) {
        representation.setId(id);
        return this;
    }

    public EmpresaRepresentationBuilder nome(String nome) {
        representation.setNome(nome);
        return this;
    }

    public EmpresaRepresentationBuilder razaoSocial(String razaoSocial) {
        representation.setRazaoSocial(razaoSocial);
        return this;
    }

    public EmpresaRepresentationBuilder cnpj(String cnpj) {
        representation.setCnpj(cnpj);
        return this;
    }

    public EmpresaRepresentation build() {
        return representation;
    }
}


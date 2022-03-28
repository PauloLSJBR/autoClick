package org.una.empresa.representations.builders;

import org.una.empresa.domain.Empresa;
import org.una.empresa.domain.Endereco;
import org.una.empresa.representations.FuncionarioRepresentation;

import java.util.List;

public class FuncionarioRepresentationBuilder {

    private FuncionarioRepresentation representation = new FuncionarioRepresentation();

    public FuncionarioRepresentationBuilder id(Long id){
        representation.setId(id);
        return this;
    }

    public FuncionarioRepresentationBuilder nome(String nome){
        representation.setNome(nome);
        return this;
    }

    public FuncionarioRepresentationBuilder cpf(String cpf){
        representation.setCpf(cpf);
        return this;
    }

    public FuncionarioRepresentationBuilder cargo(String cpf){
        representation.setCpf(cpf);
        return this;
    }

    public FuncionarioRepresentationBuilder tipoContrato(FuncionarioRepresentation.TipoContrato tipoContrato) {
        representation.setTipoContrato(tipoContrato);
        return this;
    }

    public FuncionarioRepresentationBuilder endereco(Endereco endereco){
        representation.setEndereco(endereco);
        return this;
    }
    public FuncionarioRepresentationBuilder empresa(Empresa empresa){
        representation.setEmpresa(empresa);
        return this;
    }

    public FuncionarioRepresentation build() {
        return representation;
    }
}

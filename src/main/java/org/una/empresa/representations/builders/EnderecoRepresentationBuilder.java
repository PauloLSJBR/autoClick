package org.una.empresa.representations.builders;

import org.una.empresa.representations.EnderecoRepresentation;

public class EnderecoRepresentationBuilder {

    private EnderecoRepresentation representation = new EnderecoRepresentation();

    public EnderecoRepresentationBuilder id(Long id) {
        representation.setId(id);
        return this;
    }

    public EnderecoRepresentationBuilder rua(String rua) {
        representation.setRua(rua);
        return this;
    }

    public EnderecoRepresentationBuilder numero(Integer numero) {
        representation.setNumero(numero);
        return this;
    }

    public EnderecoRepresentationBuilder bairro(String bairro) {
        representation.setBairro(bairro);
        return this;
    }

    public EnderecoRepresentationBuilder estado(String estado) {
        representation.setEstado(estado);
        return this;
    }

    public EnderecoRepresentationBuilder cep(String cep) {
        representation.setCep(cep);
        return this;
    }

    public EnderecoRepresentation build() {
         return representation;
    }
}

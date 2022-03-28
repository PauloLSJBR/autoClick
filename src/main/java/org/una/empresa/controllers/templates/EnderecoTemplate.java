package org.una.empresa.controllers.templates;

import org.una.empresa.domain.Endereco;
import org.una.empresa.representations.EnderecoRepresentation;
import org.una.empresa.representations.builders.EnderecoRepresentationBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class EnderecoTemplate {

    public static EnderecoRepresentation outbound(Endereco cli){

        return new EnderecoRepresentationBuilder()
                .id(cli.getId())
                .rua(cli.getRua())
                .numero(cli.getNumero())
                .bairro(cli.getBairro())
                .estado(cli.getEstado())
                .cep(cli.getCep())
                .build();
    }

    public static List<EnderecoRepresentation> outbound(List<Endereco> enderecos){
        return enderecos.stream().map(cli->EnderecoTemplate.outbound(cli)).collect(Collectors.toList());
    }
}

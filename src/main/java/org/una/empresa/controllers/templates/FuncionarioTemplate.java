package org.una.empresa.controllers.templates;

import org.una.empresa.domain.Funcionario;
import org.una.empresa.representations.FuncionarioRepresentation;
import org.una.empresa.representations.builders.FuncionarioRepresentationBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class FuncionarioTemplate {

    public static FuncionarioRepresentation outbound(Funcionario cli){

        return new FuncionarioRepresentationBuilder()
                .id(cli.getId())
                .nome(cli.getNome())
                .cpf(cli.getCpf())
                .cargo(cli.getCargo())
                .endereco(cli.getEndereco())
                .empresa(cli.getEmpresa())
                .tipoContrato(FuncionarioRepresentation.TipoContrato.valueOf(cli.getTipoContrato().name()))
                .build();
    }

    public static List<FuncionarioRepresentation> outbound(List<Funcionario> funcionarios){
        return funcionarios.stream().map(cli->FuncionarioTemplate.outbound(cli)).collect(Collectors.toList());
    }
}

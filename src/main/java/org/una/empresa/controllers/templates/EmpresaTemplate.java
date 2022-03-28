package org.una.empresa.controllers.templates;

import org.una.empresa.domain.Empresa;
import org.una.empresa.representations.EmpresaRepresentation;
import org.una.empresa.representations.builders.EmpresaRepresentationBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class EmpresaTemplate {

    public static EmpresaRepresentation outbound(Empresa cli){
        return new EmpresaRepresentationBuilder()
                .id(cli.getId())
                .cnpj(cli.getCnpj())
                .nome(cli.getNome())
                .funcionarios(FuncionarioTemplate.outbound(cli.getFuncionarios()))
                .build();
    }

    public static List<EmpresaRepresentation> outbound(List<Empresa> empresas){
        return empresas.stream().map(cli->EmpresaTemplate.outbound(cli)).collect(Collectors.toList());
    }
}

//                .funcionarios(cli.getFuncionarios().stream()
//                        .map(funcionario -> new FuncionarioRepresentationBuilder()
//                        .id(funcionario.getId())
//                        .cpf(funcionario.getCpf())
//                        .nome(funcionario.getNome())
//                        .cargo(funcionario.getCargo())
//                        .endereco(funcionario.getEndereco())
//                        .empresa(funcionario.getEmpresa())
//                        .tipoContrato(FuncionarioRepresentation.TipoContrato.valueOf(funcionario.getTipoContrato().name()))
//                        .build())
//                        .collect(Collectors.toList()))

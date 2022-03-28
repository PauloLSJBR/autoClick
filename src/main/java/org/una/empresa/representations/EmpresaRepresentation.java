package org.una.empresa.representations;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.hateoas.RepresentationModel;

import java.util.ArrayList;
import java.util.List;

public class EmpresaRepresentation extends RepresentationModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nome;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String razaoSocial;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cnpj;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<FuncionarioRepresentation> funcionarios = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<FuncionarioRepresentation> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<FuncionarioRepresentation> funcionarios) {
        this.funcionarios = funcionarios;
    }
}

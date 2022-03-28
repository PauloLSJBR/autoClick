package org.una.empresa.representations;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.hateoas.RepresentationModel;
import org.una.empresa.domain.Empresa;
import org.una.empresa.domain.Endereco;

public class FuncionarioRepresentation extends RepresentationModel {

    public enum TipoContrato {
        ESTAGIARIO, ESPERIENCIA, REGISTRADO, TEMPORARIO;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nome;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cpf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cargo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private FuncionarioRepresentation.TipoContrato tipoContrato;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Endereco endereco;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Empresa empresa;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public FuncionarioRepresentation.TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(FuncionarioRepresentation.TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}

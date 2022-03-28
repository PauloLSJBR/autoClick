package org.una.empresa.exceptions;

public class FuncionarioException extends RuntimeException {

    public FuncionarioException(String mensagem) {
        super(mensagem);
    }

    public FuncionarioException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}

package org.una.empresa.exceptions;

public class EmpresaException extends RuntimeException {

    public EmpresaException(String mensagem) {
        super(mensagem);
    }

    public EmpresaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}

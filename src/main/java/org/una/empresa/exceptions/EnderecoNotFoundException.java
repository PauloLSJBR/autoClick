package org.una.empresa.exceptions;

public class EnderecoNotFoundException extends RuntimeException {

    public EnderecoNotFoundException(String mensagem) {
        super(mensagem);
    }

    public EnderecoNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}

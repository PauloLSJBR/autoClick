package org.una.empresa.exceptions;

public class EmpresaWithSameNameException extends RuntimeException {

    public EmpresaWithSameNameException(String s) {
        super(s);
    }
}

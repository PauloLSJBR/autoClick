package org.una.empresa.exceptions;

public class EmpresaNotFoundException extends RuntimeException {
    public EmpresaNotFoundException(String s) {
        super(s);
    }
}

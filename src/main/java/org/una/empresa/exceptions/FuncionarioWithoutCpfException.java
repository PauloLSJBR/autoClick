package org.una.empresa.exceptions;

public class FuncionarioWithoutCpfException extends RuntimeException {


    public FuncionarioWithoutCpfException(String s) {
        super(s);
    }
}

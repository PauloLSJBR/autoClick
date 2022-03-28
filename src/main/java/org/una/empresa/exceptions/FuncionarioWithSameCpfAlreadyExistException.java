package org.una.empresa.exceptions;

public class FuncionarioWithSameCpfAlreadyExistException extends RuntimeException {


    public FuncionarioWithSameCpfAlreadyExistException(String s) {
        super(s);
    }
}

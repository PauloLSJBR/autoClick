package org.una.empresa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.una.empresa.domain.Funcionario;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(EmpresaException.class)
    public ResponseEntity<ErrorDetails> handlerCategoriaException(EmpresaException e, HttpServletRequest request) {
        e.printStackTrace();
        ErrorDetails error = new ErrorDetails();
        error.setStatus(500l);
        error.setTitle("Categoria exception.");
        error.setUrl("http://erros.teste.com/500");
        error.setTimestamp(new SimpleDateFormat( "HH:mm:ss" ).format(new Date(System.currentTimeMillis())));
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }

    @ExceptionHandler(EnderecoNotFoundException.class)
    public ResponseEntity<ErrorDetails> handlerCategoriaNotFoundException(EnderecoNotFoundException e, HttpServletRequest request) {
        e.printStackTrace();
        ErrorDetails error = new ErrorDetails();
        error.setStatus(404l);
        error.setTitle("Categoria not found exception.");
        error.setUrl("http://erros.teste.com/404");
        error.setTimestamp(new SimpleDateFormat( "HH:mm:ss" ).format(new Date(System.currentTimeMillis())));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(FuncionarioException.class)
    public ResponseEntity<ErrorDetails> handlerClienteException(FuncionarioException e, HttpServletRequest request) {
        e.printStackTrace();
        ErrorDetails error = new ErrorDetails();
        error.setStatus(500l);
        error.setTitle("Cliente exception.");
        error.setUrl("http://erros.teste.com/500");
        error.setTimestamp(new SimpleDateFormat( "HH:mm:ss" ).format(new Date(System.currentTimeMillis())));
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }

    @ExceptionHandler(EnderecoException.class)
    public ResponseEntity<ErrorDetails> handlerClienteNotFoundException(EnderecoException e, HttpServletRequest request) {
        e.printStackTrace();
        ErrorDetails error = new ErrorDetails();
        error.setStatus(404l);
        error.setTitle("Cliente not found exception.");
        error.setUrl("http://erros.teste.com/404");
        error.setTimestamp(new SimpleDateFormat( "HH:mm:ss" ).format(new Date(System.currentTimeMillis())));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(FuncionarioWithSameCpfAlreadyExistException.class)
    public ResponseEntity<ErrorDetails> handlerClienteCPFRepException(FuncionarioWithSameCpfAlreadyExistException e, HttpServletRequest request) {
        e.printStackTrace();
        ErrorDetails error = new ErrorDetails();
        error.setStatus(409l);
        error.setTitle("CPF do Cliente ja cadastrado.");
        error.setUrl("http://erros.teste.com/409");
        error.setTimestamp(new SimpleDateFormat( "HH:mm:ss" ).format(new Date(System.currentTimeMillis())));
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(error);
    }

}
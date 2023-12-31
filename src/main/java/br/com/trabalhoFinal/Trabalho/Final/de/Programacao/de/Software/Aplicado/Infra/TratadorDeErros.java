package br.com.trabalhoFinal.Trabalho.Final.de.Programacao.de.Software.Aplicado.Infra;

import br.com.trabalhoFinal.Trabalho.Final.de.Programacao.de.Software.Aplicado.Infra.Exception.ErroDeAutenticacao;
import br.com.trabalhoFinal.Trabalho.Final.de.Programacao.de.Software.Aplicado.Infra.Exception.ErroReembolsoInexistente;
import br.com.trabalhoFinal.Trabalho.Final.de.Programacao.de.Software.Aplicado.Infra.Exception.ErroValidacaoCadastro;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import java.util.List;

@RestControllerAdvice
public class TratadorDeErros {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity tratarErro400(MethodArgumentNotValidException exception){
        List<FieldError> error = exception.getFieldErrors();
        return ResponseEntity.badRequest().body(error.stream().map(DadosErroValidacao::new).toList());
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tratarErro404(MethodArgumentNotValidException exception){
        List<FieldError> error = exception.getFieldErrors();
        return ResponseEntity.badRequest().body(error.stream().map(DadosErroValidacao::new).toList());
    }

    @ExceptionHandler(ErroDeAutenticacao.class)
    public ResponseEntity tratarErroAutenticacao(ErroDeAutenticacao exception){
        return ResponseEntity.badRequest().body(exception.getLocalizedMessage());
    }

    @ExceptionHandler(ErroReembolsoInexistente.class)
    public ResponseEntity tratarErroReembolsoInexistente(ErroReembolsoInexistente exception){
        return ResponseEntity.badRequest().body(exception.getLocalizedMessage());
    }

    @ExceptionHandler(ErroValidacaoCadastro.class)
    public ResponseEntity tratarErroValidacaoCadastro(ErroValidacaoCadastro exception){
        return ResponseEntity.badRequest().body(exception.getLocalizedMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity tratarErro500(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getLocalizedMessage());
    }

    private record DadosErroValidacao(String field, String msg){
        public DadosErroValidacao(FieldError error){
            this(error.getField(),error.getDefaultMessage());
        }
    }
}


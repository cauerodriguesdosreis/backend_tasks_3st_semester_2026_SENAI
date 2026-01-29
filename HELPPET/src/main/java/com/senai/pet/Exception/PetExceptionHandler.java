package com.senai.pet.Exception;

import com.senai.pet.DTO.Error.ErrorPetDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PetExceptionHandler {

    @ExceptionHandler (PetDuplicadoException.class)
    public ResponseEntity<ErrorPetDTO> petDuplicadoException (PetDuplicadoException e) {
        return ResponseEntity.badRequest().body(new ErrorPetDTO(400, e.getMessage(), null));
    }

    @ExceptionHandler (Exception.class)
    public ResponseEntity<ErrorPetDTO> exception (Exception e) {
        return ResponseEntity.badRequest().body(new ErrorPetDTO(500, "Erro interno no servidor.", null));
    }
}

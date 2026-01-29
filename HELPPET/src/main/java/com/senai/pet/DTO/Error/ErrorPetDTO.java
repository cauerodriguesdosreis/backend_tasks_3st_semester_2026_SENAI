package com.senai.pet.DTO.Error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ErrorPetDTO {

    private int status;
    private String mensagem;
    private LocalDateTime timestamp;

}

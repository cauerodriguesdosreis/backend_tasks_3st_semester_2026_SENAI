package com.senai.pet.Exception;

public class PetDuplicadoException extends RuntimeException {
    public PetDuplicadoException() {
        super("Nome duplicado. Tente novamente.");
    }
}

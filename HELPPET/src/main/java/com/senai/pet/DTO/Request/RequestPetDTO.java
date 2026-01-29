package com.senai.pet.DTO.Request;

import com.senai.pet.entity.Pet;
import com.senai.pet.enums.Porte;
import com.senai.pet.enums.Tipo;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestPetDTO {

    @NotBlank (message = "Este campo não deve estar vazio.")
    private String nome;

    private int idade;

    private Porte porte;

    private Tipo tipo;

    private String raca;

    public RequestPetDTO(Pet pet) {
        this.nome = pet.getNome();
        this.idade = pet.getIdade();
        this.tipo = pet.getTipo();
        this.porte = pet.getPorte();
        this.raca = pet.getRaca();
    }


    public RequestPetDTO(String nome, int idade, Porte porte, Tipo tipo) {
        this.nome = nome;
        this.idade = idade;
        this.porte = porte;
        this.tipo = tipo;
    }
}


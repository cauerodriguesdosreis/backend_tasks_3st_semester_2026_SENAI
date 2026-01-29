package com.senai.pet.DTO.Response;


import com.senai.pet.entity.Pet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePetDTO {
    
    private String nome;
    
    private int idade;

    public ResponsePetDTO(Pet pet) {
        this.nome = pet.getNome();
        this.idade = pet.getIdade();
    }

}

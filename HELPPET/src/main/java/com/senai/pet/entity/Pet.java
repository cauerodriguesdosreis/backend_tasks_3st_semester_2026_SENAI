package com.senai.pet.entity;

import com.senai.pet.enums.Porte;
import com.senai.pet.enums.Tipo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "tb_pet")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Pet {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private int idade;

    private String raca;

    private Porte porte;

    private Tipo tipo;

    public Pet(String nome, int idade, Tipo tipo, String raca, Porte porte) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.raca = raca;
        this.porte = porte;
    }
}

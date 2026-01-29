package com.senai.pet.service;

import com.senai.pet.DTO.Request.RequestPetDTO;
import com.senai.pet.DTO.Response.ResponsePetDTO;
import com.senai.pet.entity.Pet;
import com.senai.pet.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> mostrarUsuarios(RequestPetDTO dto) {
        return petRepository.findAll();
    }

    public ResponsePetDTO criarUsuario(RequestPetDTO dto) {
        Pet pet = new Pet(dto.getNome(), dto.getIdade(), dto.getTipo(), dto.getRaca(), dto.getPorte());
        petRepository.save(pet);
        return new ResponsePetDTO(pet);
    }

    public Pet buscarPorId(Long id) {
        return petRepository.findById(id).get();
    }

    public void deletarUsuario(Long id) {
        petRepository.deleteById(id);
    }

    public ResponsePetDTO atualizarUsuario(RequestPetDTO dto, Long id) {
        Pet pet = buscarPorId(id);
        pet.setNome(dto.getNome());
        pet.setIdade(dto.getIdade());
        pet.setTipo(dto.getTipo());
        pet.setRaca(dto.getRaca());
        pet.setPorte(dto.getPorte());
        return new ResponsePetDTO(petRepository.save(pet));
    }
}

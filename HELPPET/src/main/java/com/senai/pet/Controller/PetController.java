package com.senai.pet.Controller;

import com.senai.pet.DTO.Request.RequestPetDTO;
import com.senai.pet.DTO.Response.ResponsePetDTO;
import com.senai.pet.service.PetService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/pet")
public class PetController {

    @Autowired
    private final PetService petService;

    public PetController (PetService petService) {
    this.petService = petService;
    }

    @GetMapping ("/mostrar")
    public ResponseEntity mostrarUsuario (@Valid @RequestBody RequestPetDTO dto) {
        return ResponseEntity.ok().body(petService.mostrarUsuarios(dto));
    }

    @GetMapping ("/mostrar/{id}")
    public ResponseEntity mostrarUsuarioPorId (@PathVariable Long id) {
        return ResponseEntity.ok().body(petService.buscarPorId(id));
    }

    @PostMapping ("/criar")
    public ResponseEntity <ResponsePetDTO> criarUsuario (@Valid @RequestBody RequestPetDTO dto) {
        return ResponseEntity.ok().body(petService.criarUsuario(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity <RequestPetDTO> atualizarUsuario (@Valid @RequestBody RequestPetDTO dto, @PathVariable Long id) {
        petService.atualizarUsuario(dto, id);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RequestPetDTO> deletarUsuario (@PathVariable Long id) {
        petService.deletarUsuario(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}

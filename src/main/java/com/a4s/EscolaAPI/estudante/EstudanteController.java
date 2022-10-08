package com.a4s.EscolaAPI.estudante;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "estudante")
public class EstudanteController {

    private final EstudanteService estudanteService;
    
    @Autowired
    public EstudanteController(EstudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @GetMapping
    public List<Estudante> getEstudantes(){
        return estudanteService.getEstudantes();
    }


    @PostMapping //Post quando voce quer adicionar novos recursos so database

    public void registerNewEstudante(
            //Pega a requisição de mapeamento e entao mapeia para o estudante
            @RequestBody Estudante estudante){
        estudanteService.addNewEstudante(estudante);
    }
}

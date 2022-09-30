package com.a4s.EscolaAPI.estudante;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "estudante")
public class EstudanteController {

    private final EstudanteService estudanteService;
    
    public EstudanteController(EstudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @GetMapping
    public List<Estudante> getEstudantes(){
        return estudanteService.getEstudantes();
    }
    
}

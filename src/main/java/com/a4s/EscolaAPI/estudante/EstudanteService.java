package com.a4s.EscolaAPI.estudante;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class EstudanteService {

    @GetMapping
	public List<Estudante> getEstudantes(){
		return List.of(new Estudante(1L, 
			"Robinson", 
			"bob.info.guaratiba@gmail.com", 
			LocalDate.of(2022, Month.SEPTEMBER, 30), 30));
	}

}

package com.a4s.EscolaAPI.estudante;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class EstudanteService {
	private final EstudanteRepository estudanteRepository;

	@Autowired
	public EstudanteService(EstudanteRepository estudanteRepository) {
		this.estudanteRepository = estudanteRepository;
	}

	@GetMapping
	public List<Estudante> getEstudantes(){
		return estudanteRepository.findAll();
	}

}

package com.a4s.EscolaAPI.estudante;

import java.util.List;
import java.util.Optional;

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

	public void addNewEstudante(Estudante estudante) {
		Optional<Estudante> optionalEstudanteByEmail = estudanteRepository.
				findEstudanteByEmail(estudante.getEmail());
		if(optionalEstudanteByEmail.isPresent()){
			throw new IllegalStateException("Já existe este email no banco!");
		}
		estudanteRepository.save(estudante);
	}

	public void deleteEstudante(Long estudanteId) {
		boolean existe = estudanteRepository.existsById(estudanteId);
		if (!existe){
			throw new IllegalStateException("Estudante com id "
					+ estudanteId + " não existe!");
		}
		estudanteRepository.deleteById(estudanteId);
	}
}

package com.a4s.EscolaAPI.estudante;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.OCTOBER;

@Configuration
public class EstudanteConfig {

    @Bean
    CommandLineRunner commandLineRunner(EstudanteRepository estudanteRepository){
        return args -> {
            Estudante e1 = new Estudante("Robinson",
                    "robinson.mourao@dcx.ufpb.br",
                    LocalDate.of(2022, OCTOBER, 5),
                    30);

            Estudante e2 = new Estudante("Robenilson",
                    "robenilsonesponja@hotmail.com",
                    LocalDate.of(2022, OCTOBER, 5),
                    24);
            estudanteRepository.saveAll(
                    List.of(e1, e2));
        };
    }
}

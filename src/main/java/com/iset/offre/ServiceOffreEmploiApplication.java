package com.iset.offre;

import com.iset.offre.dao.OffreRepository;
import com.iset.offre.entities.Offre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ServiceOffreEmploiApplication implements CommandLineRunner {
@Autowired
	OffreRepository offreRepository;
	public static void main(String[] args) {
		SpringApplication.run(ServiceOffreEmploiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		offreRepository.save(new Offre("Web Design","informatique","AXA", 2, "FRANCE"));
		offreRepository.save(new Offre("Developpeur","informatique","Talys", 3, "TUNISIE"));
		offreRepository.save(new Offre("Architecte","informatique","SIS", 2, "FRANCE"));
	}
}

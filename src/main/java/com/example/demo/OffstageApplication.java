package com.example.demo;

import com.example.demo.entities.EtudiantEntity;
import com.example.demo.entities.OffreEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class OffstageApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(OffstageApplication.class, args);
		System.out.println();

	}
	@Override
	public void  run(String... args)throws Exception{
		restConfiguration.exposeIdsFor(EtudiantEntity.class);
		restConfiguration.exposeIdsFor(OffreEntity.class);
	}
}

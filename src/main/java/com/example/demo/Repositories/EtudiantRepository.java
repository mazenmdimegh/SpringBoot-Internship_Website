package com.example.demo.Repositories;

import com.example.demo.entities.EtudiantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")

public interface EtudiantRepository extends JpaRepository<EtudiantEntity,Long> {

}

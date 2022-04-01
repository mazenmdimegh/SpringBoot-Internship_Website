package com.example.demo.Repositories;

import com.example.demo.entities.OffreEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.awt.print.Pageable;

@RepositoryRestResource
@CrossOrigin("http://localhost:4200")

public interface OffreRepository extends JpaRepository<OffreEntity,Long> {

}

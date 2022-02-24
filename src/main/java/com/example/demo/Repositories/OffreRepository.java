package com.example.demo.Repositories;

import com.example.demo.entities.OffreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OffreRepository extends JpaRepository<OffreEntity,Long> {
}

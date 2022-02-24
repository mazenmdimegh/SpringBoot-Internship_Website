package com.example.demo.Repositories;

import com.example.demo.entities.EntrepreneurEntity;
import com.example.demo.entities.MessagerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EntrepreneurRepository extends JpaRepository<EntrepreneurEntity, MessagerieEntity> {

}

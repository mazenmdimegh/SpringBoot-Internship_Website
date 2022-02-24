package com.example.demo.Repositories;

import com.example.demo.entities.UserEntity;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
@Primary
public interface UserRepository extends JpaRepository<UserEntity,Long> {
}

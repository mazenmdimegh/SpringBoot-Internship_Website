package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.stream.Stream;


@CrossOrigin("*")
@Repository
public interface OffreRepository extends JpaRepository<Offre,Long> {
    default Stream<Offre> findById_entrepreneur(Long id) {
        return findAll().stream().filter(offre -> offre.getId_entrepreneur()==id);
    }

}

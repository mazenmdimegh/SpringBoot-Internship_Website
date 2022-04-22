package com.example.demo.Controllers;

import com.example.demo.Repositories.EtudiantRepository;
import com.example.demo.entities.EtudiantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin("*")

    public class EtudiantController {
    @Autowired
    private EtudiantRepository etudiantRepository;
    @PostMapping("/addEtudiant")
    public void saveClient(@RequestBody EtudiantEntity etudiantEntity){
    EtudiantEntity etud = etudiantEntity;
    System.out.println(etud);
    etudiantRepository.save(etudiantEntity);
    }
    }
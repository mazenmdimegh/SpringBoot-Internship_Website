package com.example.demo.Controllers;

import com.example.demo.Repositories.EntrepreneurRepository;
import com.example.demo.entities.EntrepreneurEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin("http://localhost:4200")

public class EntrepreneurController {
    @Autowired
    private EntrepreneurRepository entrepreneurRepository;
    /*@PostMapping("/addEntrepreneur")
    public void saveClient(@RequestBody EntrepreneurEntity entrepreneurEntity){
         entrepreneurRepository.save(entrepreneurEntity);
         EntrepreneurEntity entrepreneur = new EntrepreneurEntity();

    }*/
}

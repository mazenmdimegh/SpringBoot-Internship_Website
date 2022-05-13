package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Favoris;
import com.bezkoder.springjwt.models.Offre;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.repository.OffreRepository;
import com.bezkoder.springjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/offres")
public class OffreController {
    @Autowired
    public OffreRepository offreRepository ;
    @Autowired
    public UserRepository userRepository;

    @GetMapping("/all")
    public List<Offre> allAccess(){
        return offreRepository.findAll();
    }
    @DeleteMapping("/deleteById/{id_offre}")
    public void deleteById(@PathVariable(name = "id_offre")Long id_offre){
        offreRepository.deleteById(id_offre);
    }
    @PostMapping("/addOffres/{id_user}")
    public void addNewOffres(@RequestBody Offre offre ,@PathVariable(name = "id_user")Long id_user){
        Optional<User> user = userRepository.findById(id_user);
        offre.setId_entrepreneur(user.get().getId());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        LocalDate localDate = LocalDate.now();
        System.out.println(dtf.format(localDate));
        offre.setDate(localDate);
        offreRepository.save(offre);
        System.out.println(offre);
    }
    @PostMapping("/addcandidature/{id_offre}/{id_user}")
    public void addcandidature(@PathVariable(name = "id_offre")Long id_offre,@PathVariable(name = "id_user")Long id_user) {
        Optional<Offre> offre = offreRepository.findById(id_offre);
        Optional<User> user = userRepository.findById(id_user);
        List<User> candidat = offre.get().getCandidats();
        candidat.add(user.get());
        offre.get().setCandidats(candidat);

        /*List<Long> Mescandidature = user.get().getMesCandidature();
        Mescandidature.add(offre.get());
        user.get().setMesCandidature(Mescandidature);
        userRepository.save(user.get());*/
        offreRepository.save(offre.get());
        System.out.println("done");

    }
    @GetMapping("/OffreById/{id_offre}")
    public Offre OffreById(@PathVariable(name = "id_offre")Long id_offre) {
        Optional<Offre> offre = offreRepository.findById(id_offre);
        return offre.get();
    }
    @GetMapping("/OffresById_entrepreneur/{id_offre}")
    public Stream<Offre> OffresById_entrepreneur(@PathVariable(name = "id_offre")Long id_offre) {
        Stream<Offre> offre = offreRepository.findById_entrepreneur(id_offre);
        return offre;
    }

    @PostMapping("/OffreFavorisByArray")
    public Stream<Offre> OffreFavorisByArray(@RequestBody Favoris favoris) {

        Stream<Offre> offres = offreRepository.findAll()
                .stream()
                .filter(offre -> favoris.getids().contains(offre.getId()));
       return offres;
    }

    @GetMapping("/Candidats/{id_offre}")
    public List<User> Candidats(@PathVariable(name = "id_offre")Long id_offre) {
        List<User> users = userRepository.findAll();
        List<User> u = userRepository.findAll();
        u.clear();
        for (User element : users){
            for (Offre el : element.getMesCandidature()) {
                if (el.getId()==id_offre){
                    System.out.println("existtt");
                    u.add(element);
                }
            }
        }

        return u;
    }





}

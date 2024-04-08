package br.com.managementhomenew.controllers;

import br.com.managementhomenew.entities.Home;
import br.com.managementhomenew.repositories.HomeRepository;
import br.com.managementhomenew.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @Autowired
    private HomeRepository homeRepository;

    @GetMapping("/find-by-id/{id}")
    public ResponseEntity<Optional<Home>> findHomeById(@PathVariable Long id) {
        try {
            Optional<Home> response = homeService.findById(id);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch(Error e) {
            System.out.println("Error /home/find-by-id");
            System.out.println(e);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/find-all")
    public ResponseEntity<List<Home>> findAllHomes() {
        try {
            List<Home> response = homeService.findAll();
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch(Error e) {
            System.out.println("Error /home/find-all");
            System.out.println(e);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/save-home")
    public Home saveHome(@RequestBody Home home) {
        return homeService.saveHome(home);
    }
}

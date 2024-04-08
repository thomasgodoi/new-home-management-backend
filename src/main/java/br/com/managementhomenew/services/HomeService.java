package br.com.managementhomenew.services;

import br.com.managementhomenew.entities.Home;
import br.com.managementhomenew.repositories.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeService {

    @Autowired
    private HomeRepository homeRepository;

    public Optional<Home> findById(long id) {
        return homeRepository.findById(id);
    }

    public List<Home> findAll() {
        return homeRepository.findAll();
    }

    public Home saveHome(Home home) {
        return homeRepository.save(home);
    }
}

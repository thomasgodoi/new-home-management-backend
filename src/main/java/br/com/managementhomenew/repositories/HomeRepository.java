package br.com.managementhomenew.repositories;

import br.com.managementhomenew.entities.Home;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HomeRepository extends JpaRepository<Home, Long> {

    public List<Home> findAll();
}

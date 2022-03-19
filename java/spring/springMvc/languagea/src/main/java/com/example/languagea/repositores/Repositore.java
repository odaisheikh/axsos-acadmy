package com.example.languagea.repositores;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.languagea.models.Language;
@Repository
public interface Repositore extends CrudRepository<Language, Long> {
    List<Language> findAll();
    Language findByName(String name);

}

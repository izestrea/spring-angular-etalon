package com.reigncode.etalon.web;

import com.reigncode.etalon.domain.Person;
import com.reigncode.etalon.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Denis on 3/16/2015.
 */
@RestController
@RequestMapping("/api/persons")
public class PersonsController {

    @Autowired
    private PersonRepository personRepository;


    /**
     * @return all objects  from repository
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Page<Person> findAll(Pageable pageable) {
        return personRepository.findAll(pageable);
    }


    /**
     * save or update an  object
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void save(@RequestBody Person object) {
        personRepository.save(object);
    }
}

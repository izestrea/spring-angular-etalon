package com.reigncode.etalon.web;

import com.reigncode.etalon.domain.Person;
import com.reigncode.etalon.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Denis on 3/16/2015.
 * test controller
 */
@RestController
public class PersonsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonsController.class);

    @Autowired
    private PersonRepository personRepository;


    /**
     * @return all objects  from repository
     */
    @RequestMapping(value = "/api/persons", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Page<Person> findAll(Pageable pageable) {
        LOGGER.info("calling find all perssons...");
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

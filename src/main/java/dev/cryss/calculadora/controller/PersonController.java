package dev.cryss.calculadora.controller;

import dev.cryss.calculadora.model.Person;
import dev.cryss.calculadora.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll() {
        return personService.findAll ();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Person findById(@PathVariable("id") String id) {
        return personService.findById (id);
    }


}

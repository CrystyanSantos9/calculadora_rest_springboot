package dev.cryss.calculadora.service;

import dev.cryss.calculadora.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {
    private final AtomicLong counter = new AtomicLong ();

    public Person create(Person person) {
        return person;
    }

    public Person update(Person person) {
        return person;
    }

    public void delete(String id) {
        //lógica: ir à base, verificar existencia, remover e retornar 204
    }

    public Person findById(String id) {
        Person person = new Person ();
        person.setId (counter.incrementAndGet ());
        person.setFirstName ("Roberto");
        person.setLastName ("Carlos");
        person.setAddress ("Rua dos Cajus - RJ - RJ");
        person.setGender ("Male");

        return person;
    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<> ();

        for (int i = 0; i < 8; i++) {
            Person person = mockPerson (i);
            persons.add (person);
        }
        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person ();
        person.setId (counter.incrementAndGet ());
        person.setFirstName ("Person name");
        person.setLastName ("Person lastName");
        person.setAddress ("Person address");
        person.setGender ("Person gender");

        return person;
    }

}

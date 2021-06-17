package ro.fasttrackit.curs18.first.web.controller;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.curs18.first.web.model.Person;
import ro.fasttrackit.curs18.first.web.service.PersonService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    List<Person> getAllPersons(@RequestParam(required = false) String name) {
        return personService.getAll(name);
    }

    @GetMapping("{personId}")
    Person getPersonWithId(@PathVariable int personId) {
        return personService.findById(personId)
                .orElse(null);
    }

    @GetMapping("age")
    Map<String, Integer> getPersonToAge(){
        return personService.mapNameToAge();
    }

    @GetMapping("byAge")
    Map<Integer, List<Person>> groupPersonsByAge(){
        return personService.groupByAge();
    }

}

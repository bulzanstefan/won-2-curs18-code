package ro.fasttrackit.curs18.first.web.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs18.first.web.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

@Service
public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public PersonService(PersonReader reader) {
        persons.addAll(reader.readFromFile());
    }

    public List<Person> getAll(String name) {
        return persons.stream()
                .filter(person -> name == null || person.getName().contains(name))
                .collect(toList());
    }

    public Optional<Person> findById(int personId) {
        return persons.stream()
                .filter(person -> person.getId() == personId)
                .findFirst();
    }

    public Map<String, Integer> mapNameToAge() {
        return persons.stream()
                .collect(toMap(Person::getName, Person::getAge));
    }


    public Map<Integer, List<Person>> groupByAge() {
        return persons.stream()
                .collect(groupingBy(Person::getAge));
    }
}

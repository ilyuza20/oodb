package lab2;

import lab1.Person;

import java.util.List;

public class PersonService {

    public static Person findPersonByName(List<Person> persons, String searchName) {
        Person result = null;

        for (Person person : persons) {
            if (person.getName().equals(searchName)) {
                result = person;
            }
        }

        return result;
    }
}

package lab2;

import com.google.gson.JsonSyntaxException;
import lab1.Person;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {

            List<Person> persons = LoadDB.loadPersonList();

            persons.forEach(System.out::println);

            Person prs = PersonService.findPersonByName(persons, "Наталья");

            if (prs != null) {
                prs.setPhoneNumber("+71111111111");
                prs.setAddress("Moscow, Gagarin St., 11");
            }

            SaveDB.savePersonList(persons);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
    }
}

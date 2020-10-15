package lab2;

import lab1.Library;
import lab1.Person;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class LoadDB {
    public static Library load() throws IOException {
        Library library = null;
        String libraryStr = "";
        File file = new File("library.json");

        if (file.exists()) {
            libraryStr = new String(Files.readAllBytes(file.toPath()));
        }

        library = new Gson().fromJson(libraryStr, Library.class);

        return library;
    }

    /**
     * Пример чтения из файла массива JSON объектов
     */
    public static List<Person> loadPersonList() throws IOException, JsonSyntaxException {
        String pStr = "";
        File file = new File("persons.json");

        if (file.exists()) {
            pStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File persons.json not found!");
        }

        Gson gson = new Gson();

        Person[] plst = gson.fromJson(pStr, Person[].class);

        return Arrays.asList(plst);
    }
}

package lab3;

import lab1.*;
import java.util.ArrayList;
import java.util.List;

public class MainSave {
    public static void main(String[] args) {

        // Создаем объекты - читатели
        Client client1 = new Client("Дмитрий", "Глуховский", "Moscow, Pushkin St., 41", "+79276453728");
        Client client2 = new Client("Наталья", "Скворцова", "Moscow, Gagarin St., 11", "+71111111111");
        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        // Создаем объект книга
        Book book = new Book();
        book.setName("Война и мир");
        book.setAuthor(new Author("Лев", "Толстой"));
        List<Book> books = new ArrayList<>();
        books.add(book);

        // Создаем объект карта выдачи
        Delivery card = new Delivery(book, client1);
        List<Delivery> cards = new ArrayList<>();
        cards.add(card);

        Library library = new Library("Knyzhnuy", books, clients, cards);


        // сохраняем объект в в XML документ
        XMLService.saveLibraryData(library);
    }

}


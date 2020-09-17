package com.company;

import java.util.List;

public class Library {
    private String name;
    private List<Book> books;
    private List<Client> clients;
    private List<Delivery> deliveries;
    
    public void addDelivery(Delivery delivery) {
        this.deliveries.add(delivery);
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

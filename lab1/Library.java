package com.company;

import java.util.List;

public class Library {
    private String name;
    private List<Book> books;
    private List<Client> clients;
    private List<Delivery> deliveries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

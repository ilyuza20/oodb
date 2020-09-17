package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Delivery {
    private Book book;
    private Client client;
    private Calendar deliveryDate;
    private Calendar returnDate;
    private boolean returned;

    public Delivery(Book book, Client client, Library library) {
        this.book = book;
        this.client = client;
        this.deliveryDate = new GregorianCalendar();
        this.returnDate = deliveryDate;
        returnDate.add(deliveryDate.DAY_OF_MONTH, +7);
        this.returned = false;
        library.addDelivery(this);
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "book=" + book +
                ", client=" + client +
                ", deliveryDate=" + deliveryDate +
                ", returnDate=" + returnDate +
                ", returned=" + returned +
                '}';
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Calendar getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Calendar returnDate) {
        this.returnDate = returnDate;
    }

    public Calendar getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Calendar deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

}

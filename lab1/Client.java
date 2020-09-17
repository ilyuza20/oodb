package com.company;

public class Client {
    private String name;
    private String surname;
    private String lastName;
    private String address;
    private String phoneNumber;

    public Client(String name, String surname, String lastName, String address, String phoneNumber, Library library) {
        this.name = name;
        this.surname = surname;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        library.addClient(this);
    }

    public Client() {
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

package lab1;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "library")
@XmlAccessorType(XmlAccessType.FIELD)
public class Library {

    private String libraryName;
    @XmlTransient
    private List<Book> books;
    @XmlTransient
    private List<Client> clients;
    @XmlTransient
    private List<Delivery> cards;

    public Library(String libraryName, List<Book> books, List<Client> clients, List<Delivery> cards) {
        this.libraryName = libraryName;
        this.books = books;
        this.clients = clients;
        this.cards = cards;
    }
    public Library(){
    }


    public String getName() {
        return libraryName;
    }

    public void setName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addDelivery(Delivery card) {
        this.cards.add(card);
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    @XmlElementWrapper(name = "books")
    @XmlElement(name = "book")
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @XmlElementWrapper(name = "clients")
    @XmlElement(name = "client")
    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @XmlElementWrapper(name = "cards")
    @XmlElement(name = "card")
    public List<Delivery> getCards() {
        return cards;
    }

    public void setDeliveries(List<Delivery> cards) {
        this.cards = cards;
    }


    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", books=" + books +
                ", clients=" + clients +
                ", cards=" + cards +
                '}';
    }
}
package lab1;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class Delivery {

    private Book book;
    private Client client;
    private Date deliveryDate;
    private Date returnDate;
    private boolean returned;

    public Delivery(Book book, Client client) {
        this.book = book;
        this.client = client;
        this.deliveryDate = new Date();
        this.returnDate = new Date();
        this.returned = false;
    }

    public Delivery() {
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

   // @XmlElement(name = "delivery_book")
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

   // @XmlElement(name = "delivery_client")
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}

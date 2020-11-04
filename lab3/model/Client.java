package lab1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

public class Client extends Person {
    public Client(String name, String lastName, String address, String phoneNumber) {
        super(name, lastName, address, phoneNumber);

    }

    public Client() {
    }
}

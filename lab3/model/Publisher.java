package lab1;

public class Publisher {

    private String publisherName;
    private String city;

    public Publisher(String publisherName, String city) {
        this.publisherName = publisherName;
        this.city = city;
    }

    public Publisher() {
    }

    public String getName() {
        return publisherName;
    }

    public void setName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

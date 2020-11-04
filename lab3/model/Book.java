package lab1;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;

public class Book {
        private String bookName;
        private Author author;
        private Publisher publisher;
        private Date publicationDate;

        public Book(String bookName, Author author, Publisher publisher, Date publicationDate) {
            this.bookName = bookName;
            this.author = author;
            this.publisher = publisher;
            this.publicationDate = publicationDate;
        }

        public Book() {
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + bookName + '\'' +
                    ", author=" + author +
                    ", publisher=" + publisher +
                    ", publicationDate=" + publicationDate +
                    '}';
        }

        public Date getPublicationDate() {
            return publicationDate;
        }

        public void setPublicationDate(Date publicationDate) {
            this.publicationDate = publicationDate;
        }

        public Publisher getPublisher() {
            return publisher;
        }

        public void setPublisher(Publisher publisher) {
            this.publisher = publisher;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public String getName() {
            return bookName;
        }

        public void setName(String name) {
            this.bookName = name;
        }
}
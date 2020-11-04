package lab3;

import lab1.Client;
import lab1.Library;
import javax.xml.bind.*;
import java.io.File;
import java.util.List;

public class XMLService {

    /**
     * метод saveLibraryData сохраняет объект типа Library в XML документ
     */
    public static void saveLibraryData(Library library) {

        try {
            JAXBContext context = JAXBContext.newInstance(Library.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // маршаллинг объекта в файл
            marshaller.marshal(library, new File("library.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    /**
     * Метод loadLibraryFromXML преобразует XML документ в объект типа Library
     */

    public static Library loadLibraryFromXML() {

        try {
            // создаем объект JAXBContext - точку входа для JAXB
            JAXBContext jaxbContext = JAXBContext.newInstance(Library.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (Library) un.unmarshal(new File("library.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void findByName(ArrayList<Client> clients, String name) {
        for (Client client :
                clients) {
            if (client.getName().equals(name))
                System.out.println(client);
        }
    }

}

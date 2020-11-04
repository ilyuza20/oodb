package lab3;

import lab1.Library;

public class MainLoad {

    public static void main(String[] args) {

        Library unmarshalled = XMLService.loadLibraryFromXML();
        if (unmarshalled != null) {
            System.out.println(unmarshalled);
        }
    }
}

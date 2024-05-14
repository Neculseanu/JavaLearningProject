package com.tekwillacademy.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class LibraryMafiaService {

    public static void main(String[] args) {
        Library carturestilibrary001 = new Library("Carturesti");
        System.out.println(carturestilibrary001.getTheNumberOfTheBooksInTheStock());

        Book prichindelBook001 = new Book("Prichindel1", "Spiridon Vangheli");
        Book prichindelBook002 = new Book("Prichindel2", "Spiridon Vangheli");
        Book prichindelBook003 = new Book("Prichindel3", "Spiridon Vangheli");

        carturestilibrary001.addBook(prichindelBook002);
        carturestilibrary001.addBook(prichindelBook003);
        carturestilibrary001.addBook(prichindelBook002);

        System.out.println(carturestilibrary001.getTheNumberOfTheBooksInTheStock());

        System.out.println(carturestilibrary001.containsBook(prichindelBook001));

        carturestilibrary001.printTheBookTitles();

        Library librariusLibrary002 = new Library("Librarius");

        Book poorDadRichDad001 = new Book("Poor Dad, Rich Dad", "Robert K.");

        librariusLibrary002.addBook(poorDadRichDad001);
        librariusLibrary002.addBook(prichindelBook002);

        Map<String, Library> lanturiDeLibrarii = new HashMap();

        lanturiDeLibrarii.put("Strada Arborilor 4/2", carturestilibrary001);
        lanturiDeLibrarii.put("Strada Stefan cel Mare", librariusLibrary002);

        for(Map.Entry<String, Library> dataSet : lanturiDeLibrarii.entrySet()){
            System.out.println("The key is: "+ dataSet.getKey());
            System.out.println("The value is: ");
            dataSet.getValue().printTheBookTitles();
        }
    }
}

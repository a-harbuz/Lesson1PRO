package de.telran.pro003MapCompareto;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Auto {

    // Main driver method
    public static void main(String[] argv) throws Exception
    {

        // Try block to check for exceptions
        try {

            // Creating an empty TreeMap by
            // creating object of NavigableMap
            TreeMap<User2, String> treemap
                    = new TreeMap<User2, String>();

            // Populating TreeMap
            // using put() method
            treemap.put(new User2("Bob", 25),"idAlice");
            treemap.put(new User2("Alice", 18),"idBob");
            treemap.put(new User2("Pit", 35),"idCat");
            treemap.put(new User2("Cat", 32),"idPit");

            // Printing the TreeMap
            System.out.println("TreeMap: " + treemap);

            // Getting used Comparator in the map
            // using comparator() method
            Comparator comp = treemap.comparator();

            // Printing the comparator value
            System.out.println("Comparator value: " + comp);
        }

        // Catch block to handle the exception
        catch (NullPointerException e) {

            // Display message if exception occurs
            System.out.println("Exception thrown : " + e);
        }
    }
}



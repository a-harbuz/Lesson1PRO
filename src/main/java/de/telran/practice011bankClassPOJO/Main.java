package de.telran.practice011bankClassPOJO;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class Main {
    Client client = new Client(1, "Vasya",
            "Pupkin", StatusManager.WORK,
            LocalDate.now(),LocalDate.now(), "vasya@googl.com", "Berlin, Blumstr.1",
            "+4933223431233423",
            new Manager(1, "Vasya",
                    "Pupkin", StatusManager.WORK,
                    LocalDate.now(),LocalDate.now()));
    //Serialization
    Path path = Paths.get("client.dat");
//        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
//            oos.writeObject(client);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try (ObjectInputStream ois = new ObjectInputStream(
//            Files.newInputStream(path))) {
//        Person read = (Person) ois.readObject();
//        System.out.printf("Read person: %s", read);

}

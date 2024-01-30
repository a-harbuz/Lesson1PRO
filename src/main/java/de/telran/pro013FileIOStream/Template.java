package de.telran.pro013FileIOStream;

import java.io.*;

public class Template implements Serializable {
    private final String param1 = "QWE";
    private final int param2 = 555;
    public transient Float param3 = 12036.58f;

    public String getParam1() {
        return param1;
    }

    public int getParam2() {
        return param2;
    }

    public float getParam3() {
        return param3;
    }

    @Override
    public String toString() {
        return "Template{" +
                "param1='" + param1 + '\'' +
                ", param2=" + param2 +
                ", param3=" + param3 +
                '}';
    }

    public static void main(String[] args) {
        Template template = new Template();
        System.out.println("************************************************");
        System.out.println("Before Serialization.");
        System.out.println("P1: " + template.param1);
        System.out.println("P2: " + template.param2);
        System.out.println("P3: " + template.param3);

        //Serialize !!!
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("template.ser"))) {
            outputStream.writeObject(template);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}

class Main {
    public static void main(String[] args) throws RuntimeException {
        //DeSerialize !!!
        Template template;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("template.ser"))) {
            template = (Template) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("************************************************");
        System.out.println("After Serialization.");
        System.out.println("P1: " + template.getParam1());
        System.out.println("P2: " + template.getParam2());
        System.out.println("P3: " + template.param3);
    }
}

package de.telran.pro012SerializeObject;

import java.io.Serializable;

public class Template implements Serializable {
    private final String param1 = "QWE";
    private final int param2 = 555;
    private final float param3 = 12036.58f;
    //trancient - parametr serializ. ne nugno
    //private final trancient float param3 = 12036.58f;
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

    //Java Funnymem -> png
}

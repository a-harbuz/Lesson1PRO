package de.telran.pro001VechicleAbstractClass;

public abstract class Vehicle {
    private byte wheelNumber;
    private String color;

    public abstract void move();
    // метод без реализации
    // на входе и выходе нет параметров
    // задает модель поведения !!

    public abstract void gaseOut();

    public void setWheelNumber(byte wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getWheelNumber() {
        return wheelNumber;
    }

    public String getColor() {
        return color;
    }


}

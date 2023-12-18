package de.telran.pro001;

public class Motorrad extends Vehicle implements benzinEngine{
    private String sedlo = "no sedlo";
    // static фиксирует переменную - т.е. она будет только одина для всех
    // без исключения обьектов (общак для всего класса)
    // final - превращает перем. вообще в КОНСТАНТУ. Ее нельзя будет изменить.
    @Override
    public void move() { // iz abstract classe
        System.out.println("Move Motorrad " + sedlo);
    }

    @Override
    public void gaseOut() { // iz abstract classe
        System.out.println("GasOut Motorrad " + sedlo);
    }

    @Override
    public void motorStart() { // iz interfece
        System.out.println("MotorStart Motorrad " + sedlo);
    }

    public String getSedlo() {
        return sedlo;
    }

    public void setSedlo(String sedlo) {
        this.sedlo = sedlo;
    }

}

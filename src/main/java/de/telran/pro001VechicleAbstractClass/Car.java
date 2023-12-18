package de.telran.pro001;

abstract public class Car extends Vehicle implements benzinEngine {
    //реализация. Определяем,
    // как именно чтото делать.
    private String colorCar = "black";
    @Override
    public void move(){
        // ПЕРЕОПРЕДЕЛЯЕМ РАБОТУ УЖЕ СУЩ.МЕТОДА
        System.out.println("MOVE" + colorCar);
    }

    public String getColorHaare() {
        return colorCar;
    }

    public void setColorHaare(String colorHaare) {
        this.colorCar = colorHaare;
    }


    // Не переопредилили эти методы:
    //public void motorStart();  // in interface
    //public abstract void gaseOut(); // in abstract class

}

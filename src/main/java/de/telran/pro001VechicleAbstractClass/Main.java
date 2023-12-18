package de.telran.pro001VechicleAbstractClass;

public class Main {

    public static void main(String[] args) {
        // Не переопредилили все методы в классе Car
        // а сделали его тоже абстрактным
        // поэтому здесь приходится переопределять все остальные методы
        Car mikh1 = new Car() {
            @Override
            public void motorStart() {
                // in interface
                System.out.println("ZavodimMotor.");
            }

            @Override
            public void gaseOut() {
                // in abstract class
                System.out.println("Puk.");
            }
        };

        mikh1.motorStart();
        mikh1.gaseOut();

        //Покатаемся на мотоцикле
        Motorrad moto1 = new Motorrad();
        moto1.setSedlo("Red-1");
        moto1.motorStart();
        moto1.gaseOut();
        moto1.move(); // поехали

        Motorrad moto2 = new Motorrad();
        moto2.setSedlo("Blue-2");
        moto2.motorStart();
        moto2.gaseOut();
        moto2.move(); // поехали

        //Заведем первый еще раз
        moto1.motorStart();

    }

}

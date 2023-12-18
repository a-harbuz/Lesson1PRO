package de.telran.practice002;

import lombok.ToString;

public class Cat extends Animal implements Scratch{
    @Override
    void voice(){ // aus Abstract Class
        System.out.println("Mjauuuu!");
    }
    @Override // aus Abstract Class
    void poice(){
        System.out.println("Ppppmjauuuu!");
    }

    @Override
    void viljatHvortom(){
        System.out.println("Hvost Up/Down");
    }

    @Override
    public void scratched() { // aus Interface
        System.out.println("SSSS");
    }

    @Override
    public void igratsya() { // aus Interface
        System.out.println("Igrajus!");
    }
}

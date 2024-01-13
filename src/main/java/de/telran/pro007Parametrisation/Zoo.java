package de.telran.pro007Parametrisation;

import java.util.ArrayList;

public class Zoo<T> {
    Class<T> clazz;
    ArrayList<T> animals = new ArrayList<T>();

    Zoo(Class<T> clazz) {
        this.clazz = clazz;
    }
    public T createNewAnimal()
    {
        T animal = null;
        try {
            animal = clazz.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        animals.add(animal);
        return animal;
    }

}

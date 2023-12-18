package de.telran.practice001;

import java.util.Arrays;

public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

//    Создайте перечисление (enum) для представления дней недели.
//    Напишите метод, который принимает на вход день недели и
//    возвращает следующий за ним день.

    public DayOfWeek getNextDay() {
        //System.out.println(this.ordinal()); // show Current day
        //System.out.println(Arrays.toString(values())); //show All days
        DayOfWeek[] weeks =values();
        System.out.println(weeks[ordinal()+1]);
        return weeks[ordinal()+1];
    }
}


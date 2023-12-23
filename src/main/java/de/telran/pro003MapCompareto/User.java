package de.telran.pro003MapCompareto;

public class User implements Comparable<User> { //добавили возможность сортировки
    // interface Comparable & method compareTo
    private String name;
    private Integer age;

    public User(String nam, Integer age) {
        this.name = nam;
        this.age = age;
    }

    public static void sort(Task4.NameComparator nameComparator) {
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo (User o) { //указали, как именно будем сортировать по умолчанию
        return this.age-o.age;
    }

    //3**Создайте класс User с полями name и age, реализующий Comparable
    //        для сортировки по возрасту



}



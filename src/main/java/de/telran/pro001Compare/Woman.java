package de.telran.pro001Compare;

//public class Woman implements Comparable<Woman>{
public class Woman{
    public int age;
    public String colorHaare;
    public int height;

    public Woman(int age, String colorHaare) {
        this.age = age;
        this.colorHaare = colorHaare;
    }
//    @Override
//    public int compareTo(Woman o)
//    {
//        //return o.age - this.age;
//        if (o.colorHaare == "Blond") return 1;
//        if (o.colorHaare == "Black") return -1;
//        return 0; //as in default
//    }

    public String getColorHaare() {
        return colorHaare;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\nWoman{" +
                "age=" + age +
                ", colorHaare='" + colorHaare + '\'' +
                "}";
    }
}

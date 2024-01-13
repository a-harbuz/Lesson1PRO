package de.telran.pro007Parametrisation;

public class Main {
    public static void main(String[] args) {
        Account<String> acc1 = new Account<String>("2345", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account<Integer> acc2 = new Account<Integer>(2345, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);

//        Zoo<Tiger> zoo = new Zoo<Tiger>(Tiger.class); // вот тут передается тип!
//        Tiger tiger = zoo.createNewAnimal();

        Test1<String,Integer> test1 = new Test1<>("Privet",112);

    }
}

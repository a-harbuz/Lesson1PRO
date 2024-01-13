package de.telran.pro007Parametrisation;

/*
class Account{
    private int id;
    private int sum;

    Account(int id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public int getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
 */

public class Account <T> {
    private T id;
    private int sum;

    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}

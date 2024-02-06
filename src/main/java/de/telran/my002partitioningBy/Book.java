package de.telran.my002partitioningBy;

public class Book {
    private String state;

    public Book(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Book{" +
                "state='" + state + '\'' +
                '}';
    }
}

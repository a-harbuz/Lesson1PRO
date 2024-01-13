package de.telran.pro003StackQueue;


import java.util.Stack;

public class StackExample {

    private Stack<String> browserHistory = new Stack<>();
    public static void main(String[] args) {
        StackExample stackExample = new StackExample();
        stackExample.visitPage("google1.com");
        stackExample.visitPage("google2.com");
        stackExample.visitPage("google3.com");
        stackExample.visitPage("google4.com");
        stackExample.visitPage("google5.com");
        stackExample.visitPage("google6.com");
        stackExample.goBack();
        stackExample.goBack();
        stackExample.goBack();
    }

    public void visitPage(String url) {
        browserHistory.push(url);
        System.out.println("last page ist" + url);

    }

    public void goBack() {
        System.out.println(browserHistory.pop());
        //System.out.println(browserHistory.peek());

    }
}
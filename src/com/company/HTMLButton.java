package com.company;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("Hello you hve press a HTML Button");
    }

    @Override
    public void onClick() {
        System.out.println("Closing the Dialog Box. Goodbye!");
    }
}

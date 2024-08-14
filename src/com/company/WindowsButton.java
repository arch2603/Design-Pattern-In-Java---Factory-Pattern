package com.company;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("Hello you have press WindowsButton");
    }

    public void onClick() {
        System.out.println("Closing the Dialog Box. Goodbye!");
    }
}

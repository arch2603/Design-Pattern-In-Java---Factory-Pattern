package com.company;


public class WindowsButton implements Button {
    public void render() {
        System.out.println("Welcome to the WindowsButton factory");
    }

    public void onClick() {
        System.out.println("WindowsButton ");
    }
}

package com.company;

public class Application {
    static Dialog dialog;

    public static void main(String[] args)
    {
        Application app = new Application();
        app.initialize("windows");
        dialog.render();
        app.initialize("web");
        dialog.render();

    }

    public void initialize(String buttonType)
    {
        if (buttonType.equalsIgnoreCase("Windows")) {
            dialog = new WindowsDialogFactory();

        } else if (buttonType.equalsIgnoreCase("Web")) {
            dialog = new WebDialogFactory();
        }
    }
}

package com.company;

//WindowsDialog factory creating a WindowsButton
public class WindowsDialogFactory extends Dialog {

    public Button createButton() {
        return new WindowsButton();
    }

}

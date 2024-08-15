package com.company;

//WebDialog factory for creating a HMTLButton
public class WebDialogFactory extends Dialog {
    public Button createButton() {
        return new HTMLButton();
    }
}

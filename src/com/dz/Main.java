package com.dz;

public class Main {

    public static void main(String[] args) {
        ICreateDocument iCreateDocument = new CreateTextDocument();
        Editor editor = new Editor(iCreateDocument);
        editor.start();
    }
}

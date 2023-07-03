package com.firstapp;
import java.awt.*;
import java.lang.reflect.Field;
import java.text.Format;

public class FirstApp {
    public static void main(String[] args) {
        Frame fr=new Frame("My First App");
        fr.setLayout(new FlowLayout());

        Button  b = new Button("Submit");
        Label l=new Label("Name");
        TextField txt=new TextField(20);

        fr.add(l);
        fr.add(txt);
        fr.add(b);

        fr.setSize(600,600);
        fr.setVisible(true);


    }
}

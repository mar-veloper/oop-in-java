package com.marcodes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var textbox1 = new TextBox();
        System.out.println(textbox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
    }
}
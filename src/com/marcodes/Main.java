package com.marcodes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000);
        Employee.printNumberOfEmployees();
        int wage =  employee.calculateWage();
        System.out.println(wage);
    }


}
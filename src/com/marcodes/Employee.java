package com.marcodes;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numbersOfEmployees;

    public static void printNumberOfEmployees() {
        System.out.println(numbersOfEmployees);
    }

    public Employee(int baseSalary) {
       this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        this.setBaseSalary(baseSalary);
        this.setHourlyRate(hourlyRate);
        numbersOfEmployees++;
    }


    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Salary cannot be less than 0");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }


    public int calculateWage(int extraHours) {
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }

    public int calculateWage() {
        return calculateWage(0);
    }

}

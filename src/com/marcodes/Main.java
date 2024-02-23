package com.marcodes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var taxCalculator = new TaxCalculator2019(100_000);
        var taxReport =  new TaxReport();
        taxReport.show(taxCalculator);
    }
}
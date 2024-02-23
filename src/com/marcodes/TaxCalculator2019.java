package com.marcodes;

public class TaxCalculator2019 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2019(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculcateTax() {
        return taxableIncome * 0.1;
    }
}

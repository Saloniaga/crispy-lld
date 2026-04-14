package org.example.case_studies.parking_lot;

public class TruckPricingStrategy implements  PricingStrategy{
    @Override
    public double calculate(long entry, long exit) {
        return (exit-entry)/(1000*60);
    }
}

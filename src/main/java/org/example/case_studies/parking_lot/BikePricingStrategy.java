package org.example.case_studies.parking_lot;

public class BikePricingStrategy implements PricingStrategy{
    @Override
    public double calculate(long entry, long exit) {
        return 20*(exit-entry)/(1000*60*60);
    }
}

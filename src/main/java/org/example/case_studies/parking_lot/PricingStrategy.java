package org.example.case_studies.parking_lot;

public interface PricingStrategy {
    double calculate(long entry, long exit);
}

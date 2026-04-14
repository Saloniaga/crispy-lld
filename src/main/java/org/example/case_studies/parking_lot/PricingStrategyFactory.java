package org.example.case_studies.parking_lot;

import com.sun.jdi.ClassNotLoadedException;

public class PricingStrategyFactory {
    public static PricingStrategy getStrategy(VehicleType type){
        switch(type){
            case BIKE: return new BikePricingStrategy();
            case CAR: return new CarPricingStrategy();
            case TRUCK: return new TruckPricingStrategy();
            default: throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}

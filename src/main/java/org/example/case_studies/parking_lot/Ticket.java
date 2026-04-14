package org.example.case_studies.parking_lot;

import java.sql.Time;
import java.util.UUID;

public class Ticket {
    String ticketId;
    long entryTime;
    ParkingSlot parkingSlot;
    Vehicle vehicle;
    public Ticket(ParkingSlot parkingSlot, Vehicle vehicle){
        this.ticketId= UUID.randomUUID().toString();
        this.parkingSlot=parkingSlot;
        this.vehicle=vehicle;
        entryTime=System.currentTimeMillis();
    }

    //required
    public double calculateBill(long exitTime){
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(vehicle.vehicleType);
        double amount = strategy.calculate(entryTime, exitTime);
        return amount;
    }


}

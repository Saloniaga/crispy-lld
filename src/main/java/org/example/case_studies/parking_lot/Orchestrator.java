package org.example.case_studies.parking_lot;

import java.util.ArrayList;
import java.util.List;

public class Orchestrator {
    public static void main(String[] args) throws InterruptedException {
        SlotFactory factory = new SlotFactory();
        List<ParkingSlot> slots = new ArrayList<>();
        int slotNumber=1;
        for(int i=0;i<5;i++) {
            slots.add(factory.generateSlot(slotNumber++, VehicleType.CAR));
            slots.add(factory.generateSlot(slotNumber++, VehicleType.BIKE));
            slots.add(factory.generateSlot(slotNumber++, VehicleType.TRUCK));
        }
        ParkingLot.init(slots);
        ParkingLot parkingLot = ParkingLot.getInstance();
        //take user input
        Vehicle myVehicle = new Vehicle("2221", VehicleType.CAR);
        Ticket ticket = parkingLot.park(myVehicle);
        //send ticketNo to user
        //take user input to unpark
        double amount = parkingLot.unpark(ticket);
        System.out.println("Amount to be paid: "+amount);


    }
}

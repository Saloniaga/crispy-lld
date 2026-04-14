package org.example.case_studies.parking_lot;

import java.util.List;

public class ParkingLot {
    SlotManager slotManager;
    private ParkingLot(List<ParkingSlot> slots){
        slotManager = new SlotManager(slots);
    }
    private static class createInstance{
        public static ParkingLot INSTANCE;
    }
    public static ParkingLot init(List<ParkingSlot> slots){
        if(createInstance.INSTANCE==null)
            createInstance.INSTANCE = new ParkingLot(slots);
        return createInstance.INSTANCE;
    }
    public static ParkingLot getInstance(){
        if(createInstance.INSTANCE == null)
            throw new IllegalArgumentException("Instance not created");
        return createInstance.INSTANCE;
    }
    public Ticket park(Vehicle vehicle){
        ParkingSlot slot = slotManager.assign(vehicle);
        if(slot == null)return null;
        return new Ticket(slot, vehicle);
    }
    public double unpark(Ticket ticket){
        slotManager.release(ticket.parkingSlot);
        return ticket.calculateBill(System.currentTimeMillis());
    }
}

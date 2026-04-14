package org.example.case_studies.parking_lot;

import java.util.UUID;

public class ParkingSlot {
    VehicleType vehicleType;
    boolean isOccupied;
    Vehicle vehicle;

    //required
    String id;
    int slotNumber;
    public ParkingSlot(int slotNumber, VehicleType type){
        vehicleType = type;
        isOccupied = false;
        id = UUID.randomUUID().toString();
        this.slotNumber = slotNumber;
    }
    boolean canAccomodate(Vehicle vehicle){
        return !isOccupied && vehicle.vehicleType == vehicleType;
    }
    void assign(Vehicle vehicle){
        isOccupied=true;
        this.vehicle = vehicle;
    }
    void remove(){
        isOccupied=false;
        this.vehicle=null;
    }
}

package org.example.case_studies.parking_lot;

public class Vehicle {
    String vehicleNo;
    VehicleType vehicleType;
//    ParkingSlot parkingSlot; not required
    public Vehicle(String vehicleNo, VehicleType type){
        this.vehicleNo = vehicleNo;
        vehicleType = type;
    }
}

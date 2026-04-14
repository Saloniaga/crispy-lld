package org.example.case_studies.parking_lot;

import java.util.UUID;

public class SlotFactory {
    public ParkingSlot generateSlot(int slotNumber, VehicleType type){
                return new ParkingSlot(slotNumber, type);
    }
}

package org.example.case_studies.parking_lot;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.locks.ReentrantLock;

public class SlotManager {

    ReentrantLock lock=new ReentrantLock();
    HashMap<VehicleType, PriorityQueue<ParkingSlot>> availableSlots;
    public SlotManager(List<ParkingSlot> slots){
        availableSlots = new HashMap<>();
        for(ParkingSlot slot:slots){
            availableSlots.computeIfAbsent(slot.vehicleType, k->new PriorityQueue<>(Comparator.comparingInt(s -> s.slotNumber))).offer(slot);
        }
    }
    public ParkingSlot assign(Vehicle vehicle){
        lock.lock();
        try{
            PriorityQueue<ParkingSlot> pq = availableSlots.get(vehicle.vehicleType);
            if(pq.isEmpty())
            System.out.println("No vacant slots now.");
            else{
                ParkingSlot bookedSlot = pq.poll();
                return bookedSlot;
            }
            return null;
        }finally {
            lock.unlock();
        }
    }
    public void release(ParkingSlot slot){
        lock.lock();
        try{
           slot.remove();
            availableSlots.get(slot.vehicleType).offer(slot);
        } finally {
            lock.unlock();
        }
    }



}

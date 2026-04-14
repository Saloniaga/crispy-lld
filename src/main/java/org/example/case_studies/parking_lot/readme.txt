Funtional rqr:
1. Parking Lot has multiple floor.
2. Parking Slot of type: BIKE, CAR, TRUCK
3. On entry, vehicle is issued a ticket and parking slot is assigned.
4. On exit, price is calculated and the parking slot is made available.

Entities:
VehicleType: BIKE, CAR, TRUCK
Vehicle: VehicleType, ParkingSlot
Ticket
ParkingSlot

PricingStrategy
BikePricingStrategy
CarPricingStrategy
TruckPricingStrategy

Factory in Creating Slot depending on VehicleType

SlotFactory
PricingStrategyFactory

SlotManager (thread safe + optimized)
ParkingLot (singleton)
Main

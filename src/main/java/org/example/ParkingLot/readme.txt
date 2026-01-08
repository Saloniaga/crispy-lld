Vehicle enters
given a ticket that has entry time
selects a spot
when vehicle exits, pays the amount
finds realtime availability

Objects:
Vehicle - vehicle no, vehicle type
Ticket - ticket status, entry time, finds spot
Parking Spot - spot no, spot type, occupied, price
Payment - status
Gate (Entrance and Exit)
Entrance: finds parking space, generates tickets, reduces spot
Exit: cost calculation based on parking spot and time, starts payment, updates spot occupancy

Enums:
Vehicles type: two wheelers, 4 wheelers, truck
Parking Spot type: small, medium, large
Ticket Status: active, paid

Vehicle:

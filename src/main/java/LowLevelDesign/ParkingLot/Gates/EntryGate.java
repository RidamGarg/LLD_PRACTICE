package LowLevelDesign.ParkingLot.Gates;

import LowLevelDesign.ParkingLot.ParkingSpot.ParkingSpot;
import LowLevelDesign.ParkingLot.ParkingSpotManagement.ParkingSpotManagement;
import LowLevelDesign.ParkingLot.enums.VehicleType;
import LowLevelDesign.ParkingLot.factory.PSMFactory;
import LowLevelDesign.ParkingLot.model.Ticket;
import LowLevelDesign.ParkingLot.model.Vehicle;

public class EntryGate {
    PSMFactory psmFactory;
    ParkingSpotManagement parkingSpotManagement;

     ParkingSpot findParkingSpot(Vehicle v){
        psmFactory = new PSMFactory();
        parkingSpotManagement = psmFactory.getParkingSpotManagement(v.getVehicleType());
        return parkingSpotManagement.getParkingSpot();
    }
    public Ticket parkVehicle(Vehicle v) {
       // check if parking spot is null throw error
       ParkingSpot ps = this.findParkingSpot(v);
       this.parkingSpotManagement.parkVehicle(ps, v);
       return this.generateTicket(v, ps);
    }
    Ticket generateTicket(Vehicle v, ParkingSpot ps) {
        return new Ticket(v, ps);
    }
}

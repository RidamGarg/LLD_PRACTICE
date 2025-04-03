package LowLevelDesign.ParkingLot.ParkingSpotManagement;

import LowLevelDesign.ParkingLot.ParkingSpot.ParkingSpot;
import LowLevelDesign.ParkingLot.model.Vehicle;
import LowLevelDesign.ParkingLot.strategy.ParkingSpotStrategy.DefaultPSS;
import LowLevelDesign.ParkingLot.strategy.ParkingSpotStrategy.ParkingSpotStrategy;

import java.util.List;

public class ParkingSpotManagement {
    List<ParkingSpot> parkingSpots ;
    ParkingSpotStrategy pss = new DefaultPSS();
    ParkingSpotManagement(List<ParkingSpot> parkingSpots, ParkingSpotStrategy pss){
        this.parkingSpots = parkingSpots ;
        this.pss = pss ;
    }
    public ParkingSpot getParkingSpot(){
        return pss.findParkingSpot(parkingSpots) ;
    }
    public void removeParkingSpot(ParkingSpot ps){
        parkingSpots.remove(ps);
    }
    public void addParkingSpot(ParkingSpot ps){
        parkingSpots.add(ps);
    }
    public void removeParkedVehicle(ParkingSpot ps){
       ps.setEmpty(false);
       ps.setV(null);
    }
    public void parkVehicle(ParkingSpot ps, Vehicle v){
      ps.setV(v);
      ps.setEmpty(true);
    }
}

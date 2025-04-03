package LowLevelDesign.ParkingLot.strategy.ParkingSpotStrategy;

import LowLevelDesign.ParkingLot.ParkingSpot.ParkingSpot;

import java.util.List;

public class DefaultPSS implements ParkingSpotStrategy{
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) {
        return new ParkingSpot();
    }
}

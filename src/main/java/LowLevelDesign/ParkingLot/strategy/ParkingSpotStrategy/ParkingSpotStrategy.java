package LowLevelDesign.ParkingLot.strategy.ParkingSpotStrategy;

import LowLevelDesign.ParkingLot.ParkingSpot.ParkingSpot;

import java.util.List;

public interface ParkingSpotStrategy {
   ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList);
}

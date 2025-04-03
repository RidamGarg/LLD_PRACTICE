package LowLevelDesign.ParkingLot.ParkingSpotManagement;

import LowLevelDesign.ParkingLot.ParkingSpot.FourWheelerParkingSpot;
import LowLevelDesign.ParkingLot.strategy.ParkingSpotStrategy.NearLiftAndGatePSS;

public class FourWheelerPSM extends ParkingSpotManagement{


    public FourWheelerPSM() {
        super(FourWheelerParkingSpot.getParkingSpots(), new NearLiftAndGatePSS());
    }


}


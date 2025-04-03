package LowLevelDesign.ParkingLot.ParkingSpotManagement;

import LowLevelDesign.ParkingLot.ParkingSpot.FourWheelerParkingSpot;
import LowLevelDesign.ParkingLot.ParkingSpot.ParkingSpot;
import LowLevelDesign.ParkingLot.strategy.ParkingSpotStrategy.NearLiftAndGatePSS;
import LowLevelDesign.ParkingLot.strategy.ParkingSpotStrategy.ParkingSpotStrategy;

import java.util.ArrayList;
import java.util.List;

public class FourVheelerPSM extends ParkingSpotManagement{


    public FourVheelerPSM() {
        super(FourWheelerParkingSpot.getParkingSpots(), new NearLiftAndGatePSS());
    }


}


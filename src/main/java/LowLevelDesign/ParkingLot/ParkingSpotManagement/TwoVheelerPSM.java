package LowLevelDesign.ParkingLot.ParkingSpotManagement;

import LowLevelDesign.ParkingLot.ParkingSpot.ParkingSpot;
import LowLevelDesign.ParkingLot.ParkingSpot.TwoWheelerParkingSpot;
import LowLevelDesign.ParkingLot.strategy.ParkingSpotStrategy.NearEntryGatePSS;
import LowLevelDesign.ParkingLot.strategy.ParkingSpotStrategy.ParkingSpotStrategy;

import java.util.List;

public class TwoVheelerPSM extends ParkingSpotManagement{

    public TwoVheelerPSM() {
        super(TwoWheelerParkingSpot.getParkingSpots(), new NearEntryGatePSS());
    }

}

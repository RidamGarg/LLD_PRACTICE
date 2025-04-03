package LowLevelDesign.ParkingLot.ParkingSpotManagement;

import LowLevelDesign.ParkingLot.ParkingSpot.TwoWheelerParkingSpot;
import LowLevelDesign.ParkingLot.strategy.ParkingSpotStrategy.NearEntryGatePSS;

public class TwoWheelerPSM extends ParkingSpotManagement{

    public TwoWheelerPSM() {
        super(TwoWheelerParkingSpot.getParkingSpots(), new NearEntryGatePSS());
    }

}

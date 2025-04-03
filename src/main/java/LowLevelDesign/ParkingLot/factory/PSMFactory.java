package LowLevelDesign.ParkingLot.factory;

import LowLevelDesign.ParkingLot.ParkingSpotManagement.FourVheelerPSM;
import LowLevelDesign.ParkingLot.ParkingSpotManagement.ParkingSpotManagement;
import LowLevelDesign.ParkingLot.ParkingSpotManagement.TwoVheelerPSM;
import LowLevelDesign.ParkingLot.enums.VehicleType;

public class PSMFactory {
    public ParkingSpotManagement getParkingSpotManagement(VehicleType vt) {
        switch (vt) {
            case Two_Wheeler -> {
                return new TwoVheelerPSM();
            }
            case Four_Wheeler -> {
                return new FourVheelerPSM();
            }
            default -> {
                return null;
            }
        }
    }
}

package LowLevelDesign.ParkingLot.factory;

import LowLevelDesign.ParkingLot.ParkingSpotManagement.FourWheelerPSM;
import LowLevelDesign.ParkingLot.ParkingSpotManagement.ParkingSpotManagement;
import LowLevelDesign.ParkingLot.ParkingSpotManagement.TwoWheelerPSM;
import LowLevelDesign.ParkingLot.enums.VehicleType;

public class PSMFactory {
    public ParkingSpotManagement getParkingSpotManagement(VehicleType vt) {
        switch (vt) {
            case Two_Wheeler -> {
                return new TwoWheelerPSM();
            }
            case Four_Wheeler -> {
                return new FourWheelerPSM();
            }
            default -> {
                return null;
            }
        }
    }
}

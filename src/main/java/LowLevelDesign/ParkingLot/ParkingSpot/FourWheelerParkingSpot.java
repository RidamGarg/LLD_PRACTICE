package LowLevelDesign.ParkingLot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpot extends ParkingSpot{
    Integer price(){
        return this.price + 20;
    }
    public static List<ParkingSpot> getParkingSpots() {
        List<ParkingSpot> parkingSpotList = new ArrayList<>();
        parkingSpotList.add(new FourWheelerParkingSpot());
        return parkingSpotList;
    }
}

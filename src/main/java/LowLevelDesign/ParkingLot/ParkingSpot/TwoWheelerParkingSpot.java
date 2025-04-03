package LowLevelDesign.ParkingLot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpot extends ParkingSpot{
    Integer price(){
        return this.price + 10;
    }
    public static List<ParkingSpot> getParkingSpots() {
        List<ParkingSpot> parkingSpotList = new ArrayList<>();
        parkingSpotList.add(new TwoWheelerParkingSpot());
        return parkingSpotList;
    }
}

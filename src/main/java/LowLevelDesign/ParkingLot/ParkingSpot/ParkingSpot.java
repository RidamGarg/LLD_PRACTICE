package LowLevelDesign.ParkingLot.ParkingSpot;

import LowLevelDesign.ParkingLot.model.Vehicle;

public class ParkingSpot {
    Integer id;
    Vehicle v;
    Integer price = 100;
    Boolean isEmpty;

    public Integer getFair() {
        return price;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id=" + id +
                ", v=" + v +
                ", price=" + price +
                ", isEmpty=" + isEmpty +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setV(Vehicle v) {
        this.v = v;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }
}

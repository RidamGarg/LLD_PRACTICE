package LowLevelDesign.ParkingLot.model;

import LowLevelDesign.ParkingLot.ParkingSpot.ParkingSpot;

public class Ticket {
    Long entry_time;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entry_time = System.currentTimeMillis();
    }

    public Long getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(Long entry_time) {
        this.entry_time = entry_time;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "entry_time=" + entry_time +
                ", vehicle=" + vehicle +
                ", parkingSpot=" + parkingSpot +
                '}';
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

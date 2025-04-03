package LowLevelDesign.ParkingLot;

import LowLevelDesign.ParkingLot.Gates.EntryGate;
import LowLevelDesign.ParkingLot.Gates.ExitGate;
import LowLevelDesign.ParkingLot.enums.PaymentType;
import LowLevelDesign.ParkingLot.enums.VehicleType;
import LowLevelDesign.ParkingLot.model.Ticket;
import LowLevelDesign.ParkingLot.model.Vehicle;

import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(VehicleType.Four_Wheeler, "UP12BF0593");
        EntryGate eg = new EntryGate();
        Ticket t = eg.parkVehicle(v);

        System.out.println(t.toString());


        // Exit Gate
        ExitGate exitGate = new ExitGate();
        System.out.println(exitGate.getTicketPrice(t));
        exitGate.collectPayment(PaymentType.Cash);
        exitGate.removeVehicle();

    }
}

package LowLevelDesign.ParkingLot.Gates;

import LowLevelDesign.ParkingLot.ParkingSpotManagement.ParkingSpotManagement;
import LowLevelDesign.ParkingLot.enums.PaymentType;
import LowLevelDesign.ParkingLot.factory.CostComputorFactory;
import LowLevelDesign.ParkingLot.factory.PSMFactory;
import LowLevelDesign.ParkingLot.factory.PaymentFactory;
import LowLevelDesign.ParkingLot.model.Ticket;
import LowLevelDesign.ParkingLot.strategy.CostComputor.CostComputor;
import LowLevelDesign.ParkingLot.strategy.PaymentStrategy.PaymentStrategy;

public class ExitGate {
    PSMFactory  psmFactory = new PSMFactory();
    CostComputorFactory ccf = new CostComputorFactory();
    PaymentFactory pf = new PaymentFactory();
    PaymentStrategy ps;
    Integer ticketPrice;
    Ticket t ;

    // Get Ticket Price
    public Integer getTicketPrice(Ticket t) {
        this.t = t;
        return ticketPrice = ccf.getCostComputor(t.getVehicle().getVehicleType()).getParkingCost(t);
    }

    // Collect Payment make Payment Interface
    public void collectPayment(PaymentType pt) {
        ps = pf.getParkingSpotManagement(pt);
        ps.collectPayment();
    }

    // Remove Vehicle from Parking
    public void removeVehicle() {
       psmFactory.getParkingSpotManagement(t.getVehicle().getVehicleType()).removeParkedVehicle(t.getParkingSpot());
    }
}

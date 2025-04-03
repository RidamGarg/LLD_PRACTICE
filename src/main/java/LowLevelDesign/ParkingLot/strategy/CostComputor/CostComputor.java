package LowLevelDesign.ParkingLot.strategy.CostComputor;

import LowLevelDesign.ParkingLot.model.Ticket;
import LowLevelDesign.ParkingLot.strategy.PricingStrategy.PricingStrategy;

public class CostComputor {
    PricingStrategy ps ;
    public CostComputor(PricingStrategy ps){
        this.ps = ps;
    }
    public Integer getParkingCost(Ticket ticket) {
       return ps.getPrice(ticket) ;
    }
}

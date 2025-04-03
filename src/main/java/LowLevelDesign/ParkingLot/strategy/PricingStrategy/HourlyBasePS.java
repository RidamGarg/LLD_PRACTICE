package LowLevelDesign.ParkingLot.strategy.PricingStrategy;

import LowLevelDesign.ParkingLot.model.Ticket;

public class HourlyBasePS extends PricingStrategy {
    public Integer getPrice(Ticket ticket){
        return (int) ((System.currentTimeMillis() - ticket.getEntry_time())/60) * 10;
    }
}

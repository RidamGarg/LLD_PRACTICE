package LowLevelDesign.ParkingLot.strategy.PricingStrategy;

import LowLevelDesign.ParkingLot.model.Ticket;

public class MinuteBasePS extends PricingStrategy {
    public Integer getPrice(Ticket ticket){
        return (int) ((System.currentTimeMillis() - ticket.getEntry_time())) * 10;
    }
}

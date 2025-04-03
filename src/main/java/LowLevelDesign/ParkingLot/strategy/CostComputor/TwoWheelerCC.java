package LowLevelDesign.ParkingLot.strategy.CostComputor;

import LowLevelDesign.ParkingLot.strategy.PricingStrategy.HourlyBasePS;
import LowLevelDesign.ParkingLot.strategy.PricingStrategy.PricingStrategy;

public class TwoWheelerCC extends CostComputor{
    public TwoWheelerCC() {
        super(new HourlyBasePS());
    }
}

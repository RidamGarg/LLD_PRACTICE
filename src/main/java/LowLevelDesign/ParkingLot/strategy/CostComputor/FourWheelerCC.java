package LowLevelDesign.ParkingLot.strategy.CostComputor;

import LowLevelDesign.ParkingLot.strategy.PricingStrategy.MinuteBasePS;

public class FourWheelerCC extends CostComputor{
    public FourWheelerCC(){
        super(new MinuteBasePS());
    }
}

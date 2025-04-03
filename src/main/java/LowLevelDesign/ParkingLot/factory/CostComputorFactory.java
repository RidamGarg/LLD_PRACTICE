package LowLevelDesign.ParkingLot.factory;

import LowLevelDesign.ParkingLot.enums.VehicleType;
import LowLevelDesign.ParkingLot.strategy.CostComputor.CostComputor;
import LowLevelDesign.ParkingLot.strategy.CostComputor.FourWheelerCC;
import LowLevelDesign.ParkingLot.strategy.CostComputor.TwoWheelerCC;
import LowLevelDesign.ParkingLot.strategy.PricingStrategy.PricingStrategy;

public class CostComputorFactory {
    public CostComputor getCostComputor(VehicleType vt) {
        switch (vt) {
            case Two_Wheeler -> {
                return new TwoWheelerCC();
            }
            case Four_Wheeler -> {
                return new FourWheelerCC();
            }
            default -> {
                return new CostComputor(new PricingStrategy());
            }
        }
    }
}

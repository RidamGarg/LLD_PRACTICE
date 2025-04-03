package LowLevelDesign.ParkingLot.factory;

import LowLevelDesign.ParkingLot.ParkingSpotManagement.FourVheelerPSM;
import LowLevelDesign.ParkingLot.ParkingSpotManagement.ParkingSpotManagement;
import LowLevelDesign.ParkingLot.ParkingSpotManagement.TwoVheelerPSM;
import LowLevelDesign.ParkingLot.enums.PaymentType;
import LowLevelDesign.ParkingLot.enums.VehicleType;
import LowLevelDesign.ParkingLot.strategy.PaymentStrategy.CardPaymentStrategy;
import LowLevelDesign.ParkingLot.strategy.PaymentStrategy.CashPaymentStrategy;
import LowLevelDesign.ParkingLot.strategy.PaymentStrategy.PaymentStrategy;

public class PaymentFactory {
    public PaymentStrategy getParkingSpotManagement(PaymentType pt) {
        switch (pt) {
            case CreditCard -> {
                return new CardPaymentStrategy();
            }
            case Cash -> {
                return new CashPaymentStrategy();
            }
            default -> {
                return null;
            }
        }
    }
}

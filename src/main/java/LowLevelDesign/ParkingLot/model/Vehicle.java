package LowLevelDesign.ParkingLot.model;

import LowLevelDesign.ParkingLot.enums.*;

public class Vehicle {
   VehicleType vehicleType;
   String vehicleNumber;

   public Vehicle(VehicleType vehicleType, String vehicleNumber) {
      this.vehicleType = vehicleType;
      this.vehicleNumber = vehicleNumber;
   }

   public VehicleType getVehicleType() {
      return vehicleType;
   }

   public void setVehicleType(VehicleType vehicleType) {
      this.vehicleType = vehicleType;
   }

   public String getVehicleNumber() {
      return vehicleNumber;
   }

   @Override
   public String toString() {
      return "Vehicle{" +
              "vehicleType=" + vehicleType +
              ", vehicleNumber='" + vehicleNumber + '\'' +
              '}';
   }

   public void setVehicleNumber(String vehicleNumber) {
      this.vehicleNumber = vehicleNumber;
   }
}

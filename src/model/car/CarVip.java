package model.car;

public class CarVip{
   private String nameCar;
   private String color;
   private String licensePlate;
   private String price;
   private String status;

   public CarVip() {
   }

   public CarVip(String nameCar, String color, String licensePlate, String price, String status) {
      this.nameCar = nameCar;
      this.color = color;
      this.licensePlate = licensePlate;
      this.price = price;
      this.status = status;
   }

   public String getNameCar() {
      return nameCar;
   }

   public void setNameCar(String nameCar) {
      this.nameCar = nameCar;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public String getLicensePlate() {
      return licensePlate;
   }

   public void setLicensePlate(String licensePlate) {
      this.licensePlate = licensePlate;
   }

   public String getPrice() {
      return price;
   }

   public void setPrice(String price) {
      this.price = price;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   @Override
   public String toString() {
      return "CarVip{" +
              "nameCar='" + nameCar + '\'' +
              ", color='" + color + '\'' +
              ", licensePlate='" + licensePlate + '\'' +
              ", price='" + price + '\'' +
              ", status='" + status + '\'' +
              '}';
   }
}

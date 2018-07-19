public class Car {
 private String carName;
 private double mileage, price;
 private boolean luxuryType;
 
 public void setCarDetails(String carName, double mileage, double price, boolean luxuryType) {
  this.carName = carName;
  this.mileage = mileage;
  this.price = price;
  this.luxuryType = luxuryType;
 }
 @Override
 public String toString() {
  return "Car [carName=" + carName + ", mileage=" + mileage + ", price=" + price + ", luxuryType=" + luxuryType
    + "]";
 }
 
 public String getCarName() {
  return carName;
 }
 public double getMileage() {
  return mileage;
 }
 public void setMileage(double mileage) {
  this.mileage = mileage;
 }
 public boolean isLuxuryType() {
  return luxuryType;
 }
 public void setLuxuryType(boolean luxuryType) {
  this.luxuryType = luxuryType;
 }
 public void setPrice(double price) {
  this.price = price;
 }
 public void setCarName(String carName) {
  this.carName = carName;
 }
 public double getPrice() {
  return price;
 }
 public void printCarDetails() {
  this.toString();
 }
 
 
 
}
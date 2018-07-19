import java.util.Iterator;
public class TestCar {
 
 public static void chooseMyCar(Car cars[]) {
  for (Car car : cars) {
   if(car.getMileage() > 10 && car.getPrice() > 230000) {
    System.out.println(car.getCarName() + " is the best car");
    return;
   }
  }
  
  System.out.println("No car is found");
 }
 public static void main(String[] args) {
  Car c1 = new Car();
  Car c2 = new Car();
  Car c3 = new Car();
  Car c4 = new Car();
  Car c5 = new Car();
  
  c1.setCarDetails("Alt", 20, 34234, false);
  c2.setCarDetails("Zen", 20, 3454, false);
  c3.setCarDetails("BMW i3", 10, 4545545, true);
  c4.setCarDetails("Van", 23, 5454, false);
  c4.setCarDetails("Benz E Class", 10, 45632123, true);
  c5.setCarDetails("Amaze", 23, 45456, false);
  
  Car cars[] = {c1, c2, c3, c4, c5};
  
  for (int i = 0; i < cars.length; i++) {
   cars[i].printCarDetails();
  }
  
  Car costliest = cars[0];
  for (Car car : cars) {
   if(car.getPrice() > costliest.getPrice()) {
    costliest = car;
   }
  }
  
  System.out.println("Costliest car is " + costliest.getCarName());
  chooseMyCar(cars);
 }
} 
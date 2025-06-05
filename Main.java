package dhanu;
//Abstract class representing a car
abstract class Car {
 // Abstract methods for driving a car
 abstract void start();
 abstract void accelerate();
 abstract void brake();
 abstract void stop();
}

//Concrete class that implements only the necessary features to drive
class DriverCar extends Car {
 @Override
 void start() {
     System.out.println("Car started with ignition key.");
 }

 @Override
 void accelerate() {
     System.out.println("Car is accelerating using the accelerator.");
 }

 @Override
 void brake() {
     System.out.println("Car is slowing down using the brake.");
 }

 @Override
 void stop() {
     System.out.println("Car has stopped.");
 }
}

//Main class to use the car
public class Main {
 public static void main(String[] args) {
     Car myCar = new DriverCar();
     myCar.start();
     myCar.accelerate();
     myCar.brake();
     myCar.stop();
 }
}

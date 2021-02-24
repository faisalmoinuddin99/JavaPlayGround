/*
*************************** Dynamic Method Dispatcher ******************************
 */

class Vehicle {
    public void start(){
        System.out.println("Engine Started");
    }
    public void accelerate(){
        System.out.println("Acceleration");
    }
    public void brake(){
        System.out.println("Brake");
    }
    public void clutch(){
        System.out.println("Clutch");
    }
}
class Car extends Vehicle{

}

class Bike extends Vehicle {
    public void start(){
        System.out.println("Bike Engine Started");
    }
    public void noOfSeats(int seat){
        System.out.println(seat);
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start(); // Engine Started
        car.accelerate(); // Acceleration
        car.brake(); // Brake

        Vehicle bike = new Bike();
        bike.start(); // Bike Engine Started
        //     bike.noOfSeats(2); Error
        Bike heroHonda = new Bike();
        heroHonda.start(); // Bike Engine Started
        heroHonda.noOfSeats(2); // 2
    }
}
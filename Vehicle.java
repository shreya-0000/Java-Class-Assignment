class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }
}

class Bike extends Vehicle {
    public void start() {
        System.out.println("Bike is starting");
    }
}

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
    }
}

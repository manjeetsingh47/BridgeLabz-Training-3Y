package workshop_11_9_25;

public class TransportManagementSystem {

    // Base class
    static class Vehicle {
        String brand;
        int speed;

        public Vehicle(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        public void start() {
            System.out.println(brand + " is starting at speed " + speed + " km/h.");
        }
    }

    // Subclass: Car
    static class Car extends Vehicle {
        public Car(String brand, int speed) {
            super(brand, speed);
        }

        public void playMusic() {
            System.out.println(brand + " is playing music.");
        }
    }

    // Subclass: Bike
    static class Bike extends Vehicle {
        public Bike(String brand, int speed) {
            super(brand, speed);
        }

        public void doWheelie() {
            System.out.println(brand + " is doing a wheelie!");
        }
    }

    // Subclass: Bus
    static class Bus extends Vehicle {
        public Bus(String brand, int speed) {
            super(brand, speed);
        }

        public void announceStop(String stopName) {
            System.out.println(brand + " is announcing the next stop: " + stopName);
        }
    }

    // Main method to run the demo
    public static void main(String[] args) {
        Car car = new Car("Toyota", 120);
        Bike bike = new Bike("Yamaha", 80);
        Bus bus = new Bus("Volvo", 60);

        // All reuse start()
        car.start();
        car.playMusic();

        bike.start();
        bike.doWheelie();

        bus.start();
        bus.announceStop("Central Station");
    }
}


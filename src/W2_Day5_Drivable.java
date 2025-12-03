public class W2_Day5_Drivable {
    public static void main(String[] args) {
        Drivable[] garage = {
                new Car2(),
                new Motorcycle(),
                new Truck()
        };

        System.out.println("=== VEHICLE TEST DRIVE ===\n");

        for (Drivable d : garage) {
            d.start();
            d.accelerate();
            d.brake();
            System.out.println("-------------------");
        }
    }
}

// YOUR TASK — Complete everything below this line

// 1. Create an interface named Drivable with these three abstract methods:
//    void start();
//    void accelerate();
//    void brake();

interface Drivable {
    public void start();
    public void accelerate();
    public void brake();
}


// 2. Make the following three classes implement Drivable

class Car2 implements Drivable {
    // TODO: implement start(), accelerate(), brake() with car-style messages
    @Override
    public void start() {
       System.out.println("Car engine roaring...");
    }
    @Override
    public void accelerate() {
        System.out.println("Car speeding up!");
    }
    @Override
    public void brake() {
        System.out.println("Car slowing down...");
    }

}

class Motorcycle implements Drivable {
    // TODO: implement start(), accelerate(), brake() with motorcycle-style messages
    @Override
    public void start() {
        System.out.println("Motorcycle revving loudly!");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle zooming past!");
    }

    @Override
    public void brake() {
        System.out.println("Motorcycle stopping fast!");
    }
}

class Truck implements Drivable {
    // TODO: implement start(), accelerate(), brake() with truck-style messages
    @Override
    public void start() {
        System.out.println("Truck rumbling to life...");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck gaining speed slowly...");
    }

    @Override
    public void brake() {
        System.out.println("Truck braking with air brakes!");
    }
}



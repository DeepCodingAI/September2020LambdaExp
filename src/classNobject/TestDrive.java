package classNobject;

public class TestDrive {
    public static void main(String[] args) {
        Car car = new Car(){
            public void start() {
                System.out.println("start the car to move");
            }

            public void stop() {
                System.out.println("hit on break to stop the car");
            }
        };

        car.start();
        car.stop();

        Engine engine = (num1, num2) -> System.out.println(num1 + num2);
        engine.fly(10,12);

        Vehicle vehicle = () -> System.out.println("Let's move the vehicle");
        vehicle.move();

        RideSharing rideSharing = r -> System.out.println(r);
        rideSharing.rideOnDemand("Ride on Uber");


    }
}

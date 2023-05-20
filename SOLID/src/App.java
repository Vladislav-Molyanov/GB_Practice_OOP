import OCP.Bus;
import OCP.Car;
import OCP.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle = new Vehicle(100.5);
        vehicle.calculateAllowedSpeed(vehicle);
        Bus bus = new Bus(190.5);
        bus.calculateAllowedSpeed(vehicle);

        Car car = new Car(220.0);
        car.calculateAllowedSpeed(car);

        
    }
}

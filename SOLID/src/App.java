import LSP.Circle;
import LSP.Figure;
import LSP.Square;
import LSP.Triangle;
import OCP.Bus;
import OCP.Car;
import OCP.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------Пример OCP-------------");
        Vehicle vehicle = new Vehicle(100.5);
        vehicle.calculateAllowedSpeed(vehicle);
        Bus bus = new Bus(190.5);
        bus.calculateAllowedSpeed(vehicle);

        Car car = new Car(220.0);
        car.calculateAllowedSpeed(car);
        System.out.println("--------------Пример OCP-------------");

        System.out.println("--------------Пример LSP-------------");

        Circle circle = new Circle(5.5);
        circle.getArea();
        circle.getPerimeter();

        Square square = new Square(5.5, 5.5);
        square.getArea();
        square.getPerimeter();

        Triangle triangle = new Triangle(3.0, 3.0, 3.0);
        triangle.getArea();
        triangle.getPerimeter();        
        System.out.println("--------------Пример LSP-------------");

    }
}

package LSP;

public class Circle extends Figure {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("Площадь круга = " +  Math.PI*radius*radius);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Периметр круга = " + Math.PI*radius*2);
    }

}

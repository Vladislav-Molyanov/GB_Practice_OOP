package LSP;

public class Triangle extends Figure{

    private Double side1;
    private Double side2;
    private Double side3;
    

    public Triangle(Double side1, Double side2, Double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void getArea() {
        Double p = (side1 + side2 + side3) / 2;
        System.out.println("Площадь треугольника = " + (Math.sqrt(p*(p-side1)*(p-side2)*(p-side3))));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Периметр треугольника = " + (side1 + side2 + side3));
    }
    
}

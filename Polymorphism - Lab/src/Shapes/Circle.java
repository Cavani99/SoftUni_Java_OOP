package Shapes;

public class Circle extends Shape{
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    private Double radius;

    public Circle(Double radius){
        this.setRadius(radius);
        this.calculatePerimeter();
        this.calculateArea();
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(2  * Math.PI * this.radius);
    }

    @Override
    protected void calculateArea() {
        setArea(Math.PI * (this.radius * this.radius));
    }
}

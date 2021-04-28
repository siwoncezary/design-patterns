package solid.o;

public class Circle extends Shape{
    private double radius;
    protected Circle(String label, double radius) {
        super(label);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle " + radius);
    }

    public double getRadius() {
        return radius;
    }
}

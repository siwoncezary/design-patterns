package solid.o;

public class Rectangle extends Shape{
    private double width;
    private double height;

    protected Rectangle(String label, double width, double height) {
        super(label);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle " + width + " " + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

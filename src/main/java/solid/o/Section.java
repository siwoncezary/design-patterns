package solid.o;

public class Section extends Shape{
    private double length;

    public Section(String label, double length) {
        super(label);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void draw() {
        System.out.println("Section " + length);
    }
}

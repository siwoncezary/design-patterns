package solid.o;

abstract public class Shape {
    private final String label;

    protected Shape(String label) {
        this.label = label;
    }

    public abstract void draw();
}

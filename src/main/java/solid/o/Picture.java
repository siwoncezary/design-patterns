package solid.o;

import java.util.List;

public class Picture {
    private List<Shape> shapes;

    public Picture(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void draw(){
        for(Shape shape: shapes){
            if (shape instanceof Circle){
                Circle circle = (Circle) shape;
                System.out.println("Circle, radius: " + circle.getRadius());
            }
            if (shape instanceof Rectangle){
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Rectangle, width: " + rectangle.getWidth());
            }
        }
    }
}

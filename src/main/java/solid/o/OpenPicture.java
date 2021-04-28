package solid.o;

import java.util.List;

public class OpenPicture extends Shape{
    private List<Shape> shapes;

    public OpenPicture(String label, List<Shape> shapes) {
        super(label);
        this.shapes = shapes;
    }

    @Override
    public void draw() {
        for(Shape shape: shapes){
            shape.draw();
        }
    }
}

package solid.o;

import java.util.List;

public class PictureDemo {
    public static void main(String[] args) {
        Picture picture = new Picture(List.of(
                new Rectangle("red", 100,100),
                new Circle("kółko", 150),
                new Section("odcinek", 50)
        ));
        picture.draw();
        Shape openPicture = new OpenPicture("picture",
                List.of(
                new Rectangle("red", 100,100),
                new Circle("kółko", 150),
                new Section("odcinek", 50)
        ));
        openPicture.draw();
    }
}

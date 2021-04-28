package solid.l;

public class SubstitutionDemo {
    public static void main(String[] args) {
        Rectangle square = new Square(100);
        System.out.println("Pole powierzchni to 100 x 100 = 10_000");
        System.out.println(square.area());

        square.setHeight(200);
        System.out.println("Pole powierzchni powinno wynosić 100 x 200 = 20_000");
        System.out.println(square.area());
        Square square1 = new Square(100);
        System.out.println("Pole powierzchni powinno wynosić 200 x 200 = 40_000");
        square1.setHeight(200);
        System.out.println(square1.area());
    }
}

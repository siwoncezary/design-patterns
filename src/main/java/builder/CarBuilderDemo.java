package builder;

public class CarBuilderDemo {
    public static void main(String[] args) {
        Car car = Car.builder().model("ABC").power(100).producer("BBB").build();
        System.out.println(car);
    }
}

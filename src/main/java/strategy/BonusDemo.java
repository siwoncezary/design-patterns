package strategy;

import java.time.LocalDate;
import java.util.List;

public class BonusDemo {
    public static void main(String[] args) {
        Order order1 = new Order(
                new BirthDayBonus(LocalDate.of(2000,04,28),
                        LocalDate.now()),
                67899);
        Order order2 = new Order(
                new CompoundBonus(List.of(new RegularBonus())),
                45678);
        System.out.println(order1.getTotalPriceWithBonus());
        System.out.println(order2.getTotalPriceWithBonus());
    }
}

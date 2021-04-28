package strategy;

public class Order {
    private Bonus bonus;
    private int totalPrice;

    public Order(Bonus bonus, int totalPrice) {
        this.bonus = bonus;
        this.totalPrice = totalPrice;
    }

    public int getTotalPriceWithBonus(){
        return (totalPrice * (100 - bonus.calc(totalPrice)))/100;
    }
}

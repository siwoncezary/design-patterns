package strategy;

public class RegularBonus implements Bonus{
    private static final int LOW_BONUS_PRICE = 1_000;
    private static final int HIGHT_BONUS_PRICE = 10_000;
    private static final int LOW_BONUS = 2;
    private static final int HIGHT_BONUS = 4;
    @Override
    public int calc(int totalPrice) {
        return totalPrice > HIGHT_BONUS_PRICE ? HIGHT_BONUS : totalPrice > LOW_BONUS_PRICE ? LOW_BONUS : 0;
    }
}

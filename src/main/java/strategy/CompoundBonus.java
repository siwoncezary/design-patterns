package strategy;

import java.util.List;

public class CompoundBonus implements Bonus {
    List<Bonus> bonuses;

    public CompoundBonus(List<Bonus> bonuses) {
        this.bonuses = bonuses;
    }

    @Override
    public int calc(int totalPrice) {
        return bonuses.stream().mapToInt(bonus -> bonus.calc(totalPrice)).sum();
    }
}

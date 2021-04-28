package strategy;

import java.time.LocalDate;

public class BirthDayBonus implements Bonus {
    private static final int BONUS_VALUE = 2;
    private LocalDate birthDate;
    private LocalDate today;

    public BirthDayBonus(LocalDate birthDate, LocalDate today) {
        this.birthDate = birthDate;
        this.today = today;
    }

    /**
     * Konstruktor narusza zasadę Depency Inversion
     * Obiekt stworzony tym konstruktorem nie nadaje się do testów
     * @param birthDate
     */
    public BirthDayBonus(LocalDate birthDate){
        this.birthDate = birthDate;
        this.today = LocalDate.now();
    }

    @Override
    public int calc(int totalPrice) {
        return birthDate.getMonthValue() == today.getMonthValue()
                && birthDate.getDayOfMonth() == today.getDayOfMonth()
                ? BONUS_VALUE : 0;
    }
}

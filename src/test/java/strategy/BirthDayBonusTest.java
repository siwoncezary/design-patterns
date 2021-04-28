package strategy;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BirthDayBonusTest {

    @Test
    void shouldReturnZeroForDifferentMonthAndMonthDay() {
        //Given
        Bonus bonusTest = new BirthDayBonus(
                LocalDate.of(2000,10,11),
                LocalDate.of(2000,11,10)
                );
        //When
        int result = bonusTest.calc(100);
        //That
        assertEquals(0, result);
    }

    //Dopisz test na działający bonus czyli gdy miesiąc i dzień sa takie same dla konstruktora dwu
    //argumentowego

    /**
     * Korzystanie z konstruktora z brakiem Depency Inversion uniemożliwia
     * działanie testu w przyszłości!!!
     */
    @Test
    void shouldReturnTwoForSameMonthAndMonthDay(){
        Bonus bonus = new BirthDayBonus(LocalDate.of(2000, 04, 28));
        int result = bonus.calc(100);
        assertEquals(2, result);
    }
}
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MoneyTest {

    @Test
    public void shouldConvertINRToUSD() {
        //assign
        Money money = new Money(60.0, Currency.INR);

        //act
        money.convertToUSD();
        //assert
        assertEquals(Currency.USD, money.currency());
        assertEquals(1.0, money.amount());
    }

    @Test
    public void shouldConvertUSDToEUR() {
        //assign
        Money money = new Money(1.0, Currency.USD);

        //act
        money.convertToEUR();
        //assert
        assertEquals(Currency.EUR, money.currency());
        assertEquals(0.6, money.amount());
    }

    @Test
    public void shouldConvertEURToINR() {
        //assign
        Money money = new Money(2.0, Currency.EUR);

        //act
        money.convertToINR();
        //assert
        assertEquals(Currency.INR, money.currency());
        assertEquals(200.0, money.amount());
    }

}

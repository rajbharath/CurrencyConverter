/**
 * Created by rajbharath on 19/06/15.
 */
public interface Currency {
    int UNIT_INR = 1;
    int UNIT_USD = 60;
    int UNIT_EUR = 100;

    Currency convertToUSD();

    Currency convertToINR();

    Currency convertToEUR();
}

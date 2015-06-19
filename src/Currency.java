/**
 * Created by rajbharath on 19/06/15.
 */
public interface Currency {
    Currency INR = new INR();
    Currency USD = new USD();
    Currency EUR = new EUR();

    Double toBaseCurrencyValue();

}

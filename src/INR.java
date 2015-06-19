/**
 * Created by rajbharath on 19/06/15.
 */
public class INR implements Currency {
    double value;

    INR(double value) {
        this.value = value;
    }

    @Override
    public Currency convertToUSD() {
        double usdValue = value / UNIT_USD;
        return new USD(usdValue);
    }

    @Override
    public Currency convertToINR() {
        return this;
    }

    @Override
    public Currency convertToEUR() {
        double eurValue = value / UNIT_EUR;
        return new EUR(eurValue);
    }
}

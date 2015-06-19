/**
 * Created by rajbharath on 19/06/15.
 */
public class EUR implements Currency {
    private final double value;

    public EUR(double eurValue) {
        this.value = eurValue;

    }

    @Override
    public Currency convertToUSD() {
        double usdValue = value / UNIT_USD;
        return new USD(usdValue);
    }

    @Override
    public Currency convertToINR() {
        double inrValue = value * UNIT_EUR;
        return new INR(inrValue);
    }

    @Override
    public Currency convertToEUR() {
        return this;
    }
}

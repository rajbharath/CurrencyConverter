/**
 * Created by rajbharath on 19/06/15.
 */
public class USD implements Currency {
    private final double value;

    public USD(double usdValue) {
        this.value = usdValue;
    }

    @Override
    public Currency convertToUSD() {
        return this;
    }

    @Override
    public Currency convertToINR() {
        double inrValue = value * UNIT_USD;
        return new INR(inrValue);
    }

    @Override
    public Currency convertToEUR() {
        double inrValue = value * UNIT_EUR;
        return new EUR(inrValue);
    }
}

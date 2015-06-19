public class Money {
    private Double amount;
    private Currency currency;

    public Money(Double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money convertToUSD() {
        return convertTo(Currency.USD);
    }

    public Money convertToINR() {
        return convertTo(Currency.INR);
    }

    public Money convertToEUR() {
        return convertTo(Currency.EUR);
    }

    private Money convertTo(Currency targetCurrency) {
        Double amountInBaseCurrency = this.currency.toBaseCurrencyValue() * amount;
        amount = amountInBaseCurrency / targetCurrency.toBaseCurrencyValue();
        currency = targetCurrency;
        return this;
    }

    public Currency currency() {
        return this.currency;
    }

    public double amount() {
        return this.amount;
    }
}


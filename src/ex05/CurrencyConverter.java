package ex05;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double amountToPaidInReais(double dollarPrice, double dollarBought) {
        return dollarPrice * dollarBought * (1 + IOF);
    }
}


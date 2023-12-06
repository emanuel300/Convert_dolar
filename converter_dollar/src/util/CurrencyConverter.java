package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double convertDollar(double quantidade, double dollarPrice){
        return quantidade * dollarPrice * (1 + IOF);
    }
}

import util.CurrencyConverter;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.print("Qual é o preço do dólar? ");
        double dollarPrice = ler.nextDouble();
        System.out.print("Quantos dólares serão comprados?");
        double quantidade = ler.nextDouble();
        double result = CurrencyConverter.convertDollar(quantidade, dollarPrice);
        System.out.printf("Valor a ser pago em reais = %.2f%n", result);






        ler.close();
    }
}
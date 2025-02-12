package ex05;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();


        System.out.println("How many dollars will be bought? ");
        double dollarBought = sc.nextDouble();

        double reais = CurrencyConverter.amountToPaidInReais(dollarPrice, dollarBought);
        System.out.printf("Amount to be paid in reais: %.2f%n", reais);
    }
}

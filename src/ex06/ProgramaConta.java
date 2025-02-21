package ex06;

import java.util.Scanner;
import java.util.Locale;

public class ProgramaConta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ContaBancaria conta;

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.println("Is there an initial deposit (true/false)?");
        boolean deposit = sc.nextBoolean();

        if (deposit) {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            conta = new ContaBancaria(accountNumber, accountHolder, initialDeposit);
        } else {
            conta = new ContaBancaria(accountNumber, accountHolder);
        }

        conta.showData();

        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);

        conta.showData();

        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        conta.withdraw(withdrawValue);

        conta.setAccountHolder("Geovana Lemos"); // Mudando o accountholder usando o metodo set.

        conta.showData();

        sc.close();

    }
}

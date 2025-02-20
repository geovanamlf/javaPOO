package ex06;

public class ContaBancaria {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public ContaBancaria(int accontNumber, String accountHolder) {
        this.accountNumber = accontNumber;
        this.accountHolder = accountHolder;
    }

    public ContaBancaria(int accontNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accontNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.00;
    }

    public void showData() {
        System.out.println("Account data: ");
        System.out.printf("Account: %d, Holder: %s, Balance: %.2f%n", accountNumber, accountHolder, balance);
    }

}

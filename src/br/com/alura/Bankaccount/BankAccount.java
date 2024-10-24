package br.com.alura.Bankaccount;

public class BankAccount {
    private final int accountNumber;
    private final String holder;
    private double balance;
    private final double monthlyFee;

    public BankAccount (int accountNumber, String holder, double balance, double monthlyFee) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        this.monthlyFee = monthlyFee;
    }

    public void deposit(double depositValue){
        if (depositValue <= 0) throw new IllegalArgumentException("O valor precisa ser positivo para ser depositado.");
        setBalance(this.balance + depositValue);
    }

    public void withdraw(double withdrawValue){
        if (withdrawValue <= 0) throw new IllegalArgumentException("O valor precisa ser positivo para ser sacado.");
        if (withdrawValue > this.balance) throw new IllegalArgumentException("O valor precisa ser menor ou igual ao saldo para ser sacado.");
        setBalance(this.balance - withdrawValue);
    }

    public void displaysInfo(){
        System.out.printf("""
                **********************************
                * Nº da conta: %d                *
                * Titular da conta: %s           *
                * Saldo bancário: %.2f           *
                **********************************
                """, this.accountNumber, this.holder, this.balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }
}

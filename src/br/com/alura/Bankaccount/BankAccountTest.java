package br.com.alura.Bankaccount;

public class BankAccountTest {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(1467, "Jader", 1800.00,15);
        checkingAccount.deposit(200);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(1500);
        System.out.println(checkingAccount.getBalance());

        checkingAccount.displaysInfo();
    }
}

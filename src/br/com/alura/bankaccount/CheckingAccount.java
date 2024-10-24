package br.com.alura.bankaccount;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(int accountNumber, String holder, double balance, double monthlyFee) {
        super(accountNumber, holder, balance, monthlyFee);
    }

    @Override
    public void displaysInfo(){
        System.out.printf("""
                **********************************
                * Nº da conta: %d                *
                * Titular da conta: %s           *
                * Saldo bancário: %.2f           *
                * Taxa de manutenção: %.2f       *
                **********************************
                """, getAccountNumber(), getHolder(), getBalance(), getMonthlyFee());
    }
}

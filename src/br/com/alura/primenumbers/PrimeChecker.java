package br.com.alura.primenumbers;

public class PrimeChecker extends PrimeNumbers{
    public void checkIfPrime(int number) {
        if(checkPrimality(number)) System.out.println(number + " é primo.");
        if(!checkPrimality(number)) System.out.println(number + "não é primo.");
    }


}

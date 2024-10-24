package br.com.alura.primenumbers;

public class PrimeNumbers {
    public boolean checkPrimality(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public void listPrimes(int upperBound) {
        System.out.println("Números primos até " + upperBound + ": ");
        for (int i = 2; i < upperBound; i++) {
            if(checkPrimality(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
}

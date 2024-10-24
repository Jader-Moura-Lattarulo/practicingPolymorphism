package br.com.alura.primenumbers;

public class PrimeNumbersTest {
    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker();
        checker.checkIfPrime(17);

        PrimeGenerator generator = new PrimeGenerator();
        int nextPrime = generator.generateNextPrime(17);
        System.out.println("O próximo primo após 17 é: " + nextPrime);

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.listPrimes(30);
    }
}

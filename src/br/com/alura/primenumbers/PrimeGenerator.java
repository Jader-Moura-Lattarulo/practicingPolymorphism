package br.com.alura.primenumbers;

public class PrimeGenerator extends PrimeNumbers{
    public int generateNextPrime(int lastKnownPrime) {
        int nextNumber = lastKnownPrime + 1;
        while (!checkPrimality(nextNumber)) {
            nextNumber++;
        }
        return nextNumber;
    }
}

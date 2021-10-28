package PrimeNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface PrimeNumberGen {
    List<Integer> generate(int startingValue, int endingValue);
    boolean isPrime(int value);
}

public class FindPrimes implements PrimeNumberGen {

    public int startingValue;
    public int endingValue;

    public FindPrimes(int startingValue, int endingValue) {
        this.startingValue = startingValue;
        this.endingValue = endingValue;
    }

    public ArrayList<Integer> PrimeFinder(List<Integer> PotentialPrimes) {

        // Create an empty array for the prime numbers to be stored in
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        // Loop through the potential primes list and check to see if each number is prime
        for(int i = 0; i < PotentialPrimes.size(); i++){
            if (isPrime(PotentialPrimes.get(i))) {
                primeNumbers.add(PotentialPrimes.get(i));
            }
        }
        return primeNumbers;
    }

    public boolean isPrime(int value) {

        // Generate list from 2 to given value
        List<Integer> primeRange = generate(2, value);

        for(int i = 0; i < (primeRange.size() - 1); i++) {
            if ((Math.floorMod(value, primeRange.get(i)) == 0)) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> generate(int startingValue, int endingValue) {
        return IntStream.rangeClosed(startingValue, endingValue).boxed().collect(Collectors.toList());
    }
}

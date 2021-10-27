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

    public ArrayList<Integer> PrimeFinder(List<Integer> PotentialPrimes) {

        // Create an empty array for the prime numbers to be stored in
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        // Loop through the potential primes list and check to see if each number is prime
        for(int i=0; i<PotentialPrimes.size(); i++){
            if (isPrime(PotentialPrimes.get(i)) == true) {
                primeNumbers.add(PotentialPrimes.get(i));
            }
        }
        return primeNumbers;
    }

    public boolean isPrime(int value) {
        List<Integer> primeRange = IntStream.rangeClosed(2, value).boxed().collect(Collectors.toList());

        for(int i=0; value<primeRange.size(); i++) {
            if ((Math.floorMod(value, primeRange.get(i)) == 0)) {
                return false;
            }
            else {
                continue;
            }
        }
        return true;
    }

    public List<Integer> generate(int startingValue, int endingValue) {
        List<Integer> range = IntStream.rangeClosed(startingValue, endingValue).boxed().collect(Collectors.toList());
        return range;
    }
}

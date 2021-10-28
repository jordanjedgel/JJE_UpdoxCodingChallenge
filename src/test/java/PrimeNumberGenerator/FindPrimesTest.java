package PrimeNumberGenerator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPrimesTest {

    // Test PrimeFinder() and isPrime() returns prime numbers in 7900, 7920 range
    @Test
    void primeFinder() {
        FindPrimes test = new FindPrimes(7900, 7920);

        // Test starting and ending value
        Assert.assertEquals(7900, test.startingValue);
        Assert.assertEquals(7920, test.endingValue);
        List<Integer> PotentialPrimes = test.generate(7900, 7920);

        ArrayList<Integer> Prime_List;
        Prime_List = test.PrimeFinder(PotentialPrimes);

        // Test prime numbers are returned
        ArrayList<Integer> Test_Array = new ArrayList<>(Arrays.asList(7901, 7907, 7919));
        Assert.assertEquals(Test_Array, Prime_List);
    }

    // Test generate() function returns array within given range
    // Test generate() function reverses order when given a larger starting value
    @Test
    void generate() {
        FindPrimes test = new FindPrimes(10, 1);
        List<Integer> PotentialPrimes = test.generate(10, 1);

        ArrayList<Integer> Test_Array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Assert.assertEquals(Test_Array, PotentialPrimes);
    }
}



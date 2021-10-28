package PrimeNumberGenerator;

import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        // Take in the user's input
        int startingValue;
        int endingValue;
        ArrayList<Integer> Prime_List;

        System.out.println("Please enter the first value: ");
        startingValue = Integer.parseInt(user_input.next());

        System.out.println("Please enter the second value: ");
        endingValue = Integer.parseInt(user_input.next());

        user_input.close();

        // Swap values if starting value is larger than the ending value
        if (startingValue > endingValue) {
            int temp;
            temp = startingValue;
            startingValue = endingValue;
            endingValue = temp;
        }

        // Create instance of FindPrimes <--- Compilation error: cannot find symbol
        FindPrimes fp = new FindPrimes(startingValue, endingValue);

        // Generate the list of numbers with the given range
        List<Integer> PotentialPrimes = fp.generate(startingValue, endingValue);

        // Run the PrimeFinder method
        Prime_List = fp.PrimeFinder(PotentialPrimes);

        System.out.println("Here are the primes within your range: ");
        System.out.println(Prime_List);
    }
}

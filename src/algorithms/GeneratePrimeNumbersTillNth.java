package algorithms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneratePrimeNumbersTillNth {

    public static void main(String[] args) {
        int till_n = 1009;

        long primeNumsSet_start_time = System.nanoTime();

        System.out.println("Generated prime numbers till " + till_n + " : "
            + PrimeNumberAlgos.primeNumbersTill(till_n));

        long time_taken_l = System.nanoTime() - primeNumsSet_start_time;

        System.out.println("Total time taken (nanoSec) : " + time_taken_l);

        System.out.println("Total time taken (sec) : "+ time_taken_l/1000L);

    }

}
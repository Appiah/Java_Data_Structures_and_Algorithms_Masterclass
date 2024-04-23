package algorithms.primenumbers;

public class GeneratePrimeNumbersTillNth {

    public static void main(String[] args) {
        int till_n = 128;

        long primeNumsSet_start_time = System.currentTimeMillis();

        System.out.println("Generated prime numbers till " + till_n + " : "
            + PrimeNumberAlgos.primeNumbersTill(till_n));

        long time_taken_l = System.currentTimeMillis() - primeNumsSet_start_time;

        System.out.println("Total time taken (milliSec) : " + time_taken_l);

        System.out.println("Total time taken (sec) : "+ time_taken_l/1000L);

    }

}
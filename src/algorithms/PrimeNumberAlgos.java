package algorithms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberAlgos {

    public static boolean isPrime(int number){
        return IntStream
                .rangeClosed(2, (int) (Math.sqrt(number)))
                .allMatch(n -> number % n != 0);
    }

    public static List<Integer> primeNumbersTill(int n){
        return IntStream.rangeClosed(2, n)
                .filter(x -> PrimeNumberAlgos.isPrime(x)).boxed()
                .collect(Collectors.toList());
    }

}

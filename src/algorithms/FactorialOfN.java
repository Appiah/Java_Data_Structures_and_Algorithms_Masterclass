package algorithms;

import java.math.BigDecimal;

public class FactorialOfN {

    //Denoted by n! ( by Christian Kramp in 1808 )

    public static void main (String [] args){

        BigDecimal n = new BigDecimal(1.0001);

        System.out.println(n+" ! = "+FactorialSimpleRecursion.factorialOfN(n));

    }

}

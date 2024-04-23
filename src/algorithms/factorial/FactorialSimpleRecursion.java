package algorithms.factorial;

import java.math.BigDecimal;

public class FactorialSimpleRecursion {

    public static void main (String [] args){

    }

    //BigDecimal quick comparison guide : -1 < 0 < 1 -> less than, equal to, greater than
    static int A_is_less_than_B = -1;
    static int A_is_equal_to_B = 0;
    static int A_is_greater_than_B = 1;

    public static BigDecimal factorialOfN(BigDecimal n){
        if (n.compareTo(BigDecimal.ZERO) == A_is_greater_than_B
                && n.compareTo(BigDecimal.ONE) == A_is_greater_than_B) {
            return n.multiply(factorialOfN(n.subtract(BigDecimal.ONE)));
        }else{
            return BigDecimal.ONE;
        }
    }

}

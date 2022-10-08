package algorithms;

import java.math.BigDecimal;

public class PowerOfTwoRecursive {

    public static void main (String [] args){

    }

    public static BigDecimal powerOfTwo(int n){
        if(n==0){
            return BigDecimal.ONE;
        }else{
            BigDecimal coefficient = new BigDecimal(2);
            return  coefficient.multiply(powerOfTwo(n-1));
        }
    }

}

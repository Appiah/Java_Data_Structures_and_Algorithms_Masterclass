package algorithms;

import java.math.BigDecimal;

public class PowerOfTwoIterative {

    public static void main (String [] args){

    }

    public static BigDecimal powerOfTwo(int n){
        int i = 0;
        BigDecimal power = BigDecimal.ONE;
        BigDecimal coefficient = new BigDecimal(2);
        while(i < n){
            power = power.multiply(coefficient);
            i++;
        }
        return power;
    }

}

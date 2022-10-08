package algorithms;

import java.math.BigDecimal;

public class PowerOfNumberToNumber {

    public static void main (String [] args){

        BigDecimal coefficient = new BigDecimal(10);
        int exponent = 10;

        System.out.println(coefficient+" ˆ "+exponent+" = "
                +powerOfNumberToNumber(coefficient, exponent));

    }

    public static BigDecimal powerOfNumberToNumber(BigDecimal coefficient, int exponent){
        int i = 0;
        BigDecimal power = BigDecimal.ONE;
        while(i < exponent){
            power = power.multiply(coefficient);
            i++;
        }
        return power;
    }

}

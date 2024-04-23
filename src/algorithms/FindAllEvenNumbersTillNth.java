package algorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class FindAllEvenNumbersTillNth {

    public static void main (String [] args){

        int n0_i = 0;
        int nth_i = 128;

        System.out.println("The even numbers from "+n0_i+" to "+nth_i+", are : "
                + Arrays.toString(getEventNumsExact(n0_i, nth_i))
        );

    }

    public static int [] getEventNumsWithZeroInPlaceOfOddNums(int n0_i, int nth){

        int [] primeNums = new int[nth];

        for(int i = n0_i; i < nth; i++){
            if(i % 2 == 0){
                primeNums[i] = i;
            }
        }

        return primeNums;
    }

    public static int [] getEventNumsExact(int n0_i, int nth){

        int [] primeNums = new int[nth];

        int x = 0;

        for(int i = n0_i; i < nth; i++){
            if(i % 2 == 0){
                primeNums[x] = i;
                x++;
            }
        }

        return primeNums;
    }

}

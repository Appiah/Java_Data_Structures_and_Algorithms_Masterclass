package algorithms;

import java.util.Arrays;

public class FindSumUsingStreamInArray {

    public static void main (String [] args){

        int [] A = {1,2,3,4,5,6,7,8,9};

        int nth = 9;

        System.out.println("Using Array stream summation;\nThe sum of first "+ nth +" elements in A : "
                + Arrays.toString(A) + " is " +findUsingStream(A));

    }

    public static int findUsingStream(int [] A){
        return Arrays.stream(A).sum();
    }

}

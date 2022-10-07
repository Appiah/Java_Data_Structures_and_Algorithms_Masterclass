package algorithms;

import java.util.Arrays;

public class FindSumUsingRecursiveAlgo {

    public static void main (String [] args){

        int [] A = {1,2,3,4,5,6,7,8,9};

        int nth = 9;

        System.out.println("Using recursive summation,\nThe sum of first "+ nth +" elements in A : "
                + Arrays.toString(A) + " is " +findSumRecursively(A, nth));

    }

    public static int findSumRecursively(int [] A, int nth){
        if(nth==1)
            return A[0];
        int s = findSumRecursively(A, nth-1);
        s = s + A[nth-1];
            return s;
    }

}

package algorithms;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class FindAllPrimeNumbersTillNth {

    public static void main (String [] args){



    }

    public static int [] getPrimeNums(int nth){

        int [] primeNums = new int [nth];

        for(int i = 0; i < nth; i++){
            if(i % 2 == 0){
                primeNums[i] = i;
            }
        }

        return primeNums;
    }

}

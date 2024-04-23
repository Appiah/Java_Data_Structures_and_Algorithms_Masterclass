package algorithms.evennumbers;

import java.util.*;

public class FindAllEvenNumbersTillNth {

    public static void main (String [] args){

        int n0_i = 0;
        int nth_i = 128;

        System.out.println("The Event Nums With Zero In Place Of Odd Nums from "+n0_i+" to "+nth_i+" exclusive [using Arrays], are : \n"
                + Arrays.toString(getEventNumsWithZeroInPlaceOfOddNums(n0_i, nth_i)) + "\n"
        );

        System.out.println("The Event Nums With Tailing Zeros from "+n0_i+" to "+nth_i+" exclusive [using Arrays], are : \n"
                + Arrays.toString(getEventNumsWithTailingZeros(n0_i, nth_i)) +"\n"
        );

        System.out.println("The Event Nums from "+n0_i+" to "+nth_i+" exclusive [using ArrayList], are : \n"
                +  getEventNumsExact(n0_i, nth_i)
        );

    }

    public static int [] getEventNumsWithZeroInPlaceOfOddNums(int n0_i, int nth){

        int [] evenNums = new int[nth];

        int x = 0;

        for(int i = n0_i; i < nth; i++){
            if(i % 2 == 0){
                evenNums[x] = i;
            }
            x++;
        }

        return evenNums;
    }

    public static int [] getEventNumsWithTailingZeros(int n0_i, int nth){

        int [] evenNums = new int[nth];

        int x = 0;

        for(int i = n0_i; i < nth; i++){
            if(i % 2 == 0){
                evenNums[x] = i;
                x++;
            }
        }

        return evenNums;
    }

    public static ArrayList<Integer> getEventNumsExact(int n0_i, int nth){

        ArrayList<Integer> evenNumsArrList = new ArrayList<>();

        for(int i = n0_i; i < nth; i++){
            if(i % 2 == 0){
                evenNumsArrList.add(i);
            }

        }

        return evenNumsArrList;
    }

}

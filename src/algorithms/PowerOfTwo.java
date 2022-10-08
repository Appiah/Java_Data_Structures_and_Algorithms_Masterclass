package algorithms;

public class PowerOfTwo {

    public static void main (String [] args){

        int n = 200;

        long recursive_start_l = System.nanoTime();
        System.out.println("Recursively finding two to "+n+" th power = "+PowerOfTwoRecursive.powerOfTwo(n));
        long recursive_end_l = System.nanoTime();
        System.out.println("recursive time taken : "+(recursive_end_l - recursive_start_l));

        long iterative_start_l = System.nanoTime();
        System.out.println("Iteratively finding two to "+n+" th power = "+PowerOfTwoIterative.powerOfTwo(n));
        long iterative_end_l = System.nanoTime();
        System.out.println("iterative time taken : "+(iterative_end_l - iterative_start_l));

        System.out.println((recursive_end_l - recursive_start_l) < (iterative_end_l - iterative_start_l)? "Recursive was faster than Iterative.":"Iterative was faster than Recursive.");

    }

}

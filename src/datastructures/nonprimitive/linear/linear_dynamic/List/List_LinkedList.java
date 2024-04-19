package datastructures.nonprimitive.linear.linear_dynamic.List;

import datastructures.Utilities.Util;

import java.util.LinkedList;

public class List_LinkedList {
    private final static String DATA_STRUCTURE_NAME = "LinkedList";

    public static void main(String [] args) {

        System.out.print("Data Structures Experimentation with : ");
        System.out.print(DATA_STRUCTURE_NAME);

        LinkedList<String> ll_str = new LinkedList</*Nothing here because we are using (a) Strings*/>();

        ll_str.add("LL Item 00");
        ll_str.add("LL Item 01");
        ll_str.add("LL Item 02");
        ll_str.add("LL Item 03");

        //ll.add(7, "LL Item 06" );//this would throw an error
        //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 7, Size: 4

        Util.showLn(ll_str.toString());

        Util.showLn(ll_str.getFirst());



        Util.showLn(ll_str.getLast());

        //Methods / Functions :


    }
}

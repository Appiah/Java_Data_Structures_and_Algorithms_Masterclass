package datastructures.nonprimitive.linear.linear_dynamic.List;

import datastructures.Utilities.Util;

import java.util.ArrayList;

public class List_ArrayList {

    private final static String DATA_STRUCTURE_NAME = "ArrayList";

    public static void main(String [] args){

        Util.show("Data Structures Experimentation with : ");
        Util.show(DATA_STRUCTURE_NAME);

        Util.showLn("");

        ArrayList<String> arrList = new ArrayList<>();

        //adding of new items : O(1)
        arrList.add("Item 00");
        arrList.add("Item 01");
        arrList.add("Item 01");
        arrList.add("Item 02");

        //adding of a new item at a particular index
        arrList.add(2, "Item 03");
        //arrList.add(7, "Item 09");//this would yield this error :
        /*
        * Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
        * */

        Util.showLn("arrList elements : "+arrList);

        //get function : O(1)
        int pos = 4;
        String item_at_position_4_str = arrList.get(pos);

        Util.showLn("value at position "+pos+" is : "+item_at_position_4_str);

    }

}

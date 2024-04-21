package datastructures.nonprimitive.linear.linear_dynamic.Map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {
    //Get : 1
    //ContainsKey : 1
    //Next : h/n
    private final static String DATA_STRUCTURE_NAME = "HashMap";

    public static void main(String [] args) {

        System.out.print("Data Structures Experimentation with : ");
        System.out.print(DATA_STRUCTURE_NAME);

        Map<Character, Integer> seriesOfCharsMap = new HashMap<Character, Integer>();

        seriesOfCharsMap.put('a', 7);

        seriesOfCharsMap.put('b', 12);

        //seriesOfCharsMap.put('a', 9);

        seriesOfCharsMap.put('c', 9);

        System.out.println("\nseriesOfCharsMap : "+seriesOfCharsMap);

    }



}

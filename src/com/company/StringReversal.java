package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReversal {

    public static String reverse(String str){
        ArrayList<Integer> positions = new ArrayList<>();

        for (int i = 0; i <str.length(); i++){
            if (str.charAt(i) == ' ')
                positions.add(i);
        }
        str = str.replaceAll(" ","");

        StringBuilder sb = new StringBuilder(str).reverse();
        for(Integer i: positions)
            sb.insert(i ," ");

        return  sb.toString();
    }
}

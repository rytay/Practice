package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase {


        public static String camelCase(String str) {
            // your code here
            if(str.length() == 0)
                return "";
            str = str.trim().replaceAll(" +"," ");
            ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
            return list.stream()
                    .map(x -> x.substring(0,1).toUpperCase()+x.substring(1))
                    .collect(Collectors.joining(""));
        }

}


package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        // your code here
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();
        for(String l: lstOf1stLetter){
            counts.put(l,0);
        }
        for(String a : lstOfArt){
            String[] arr = a.split(" ");
            String firstLetter = arr[0].substring(0,1);
            Integer num = Integer.parseInt(arr[1]);
            System.out.println(firstLetter+" : "+num);
            if(counts.containsKey(firstLetter)){

                counts.put(firstLetter, counts.get(firstLetter) + num);
            }

        }
        String result = "";
        for(Map.Entry<String,Integer> entry: counts.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            result += "("+key+" : "+value+") - ";
        }



        return result.substring(0,result.length()-3);
    }


}

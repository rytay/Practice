package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Queue;

public class DoubleCola {

    public static String WhoIsNext(String[] names, int n) {
        int factor = 1;
        int prev = 0;
        //find last doubled pattern and how many times its been doubled.
        for(int i =1; i<=n; i++){
            if(i == names.length * factor + prev){
                factor = factor * 2;
                prev = i;
            }
        }

        //find where closest inorder pattern is.
        int start = names.length * (factor - 1) + 1;
        //length of segment
        int len = n - start;
        if(len == 0)
            return names[0];
        int count = 1;
        int last = 0;

        for(int i = 0; i<len; i++){
            if(count == factor){
                last++;
                count = 0;
            }
            count++;

        }

        return names[last];
}



    }

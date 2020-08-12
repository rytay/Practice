package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortOdd {

    public static int[] sort(int[] numbers){
        ArrayList<Integer> odd = new ArrayList<>();
        for(int x: numbers)
            if (x%2 != 0)
                odd.add(x);

        Collections.sort(odd,Collections.reverseOrder());
        for(int i = 0; i< numbers.length; i++)
            if (numbers[i]%2 != 0)
                numbers[i] = odd.remove(odd.size()-1);

        return numbers;

    }
}

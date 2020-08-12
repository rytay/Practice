package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {

    public static int[] compute(int[] numbers, int target){
        HashSet<Integer> done = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            int lookingFor = target - numbers[i];
            if (done.contains(lookingFor)) {
                return new int[]{numbers[i], lookingFor};
            } else
                done.add(numbers[i]);
        }
        return new int[]{};
    }
}

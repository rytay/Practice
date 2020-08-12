package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int[] parse(String data) {
        // Implement me! :

        char[] commands = data.toCharArray();
        ArrayList<Integer> list = new ArrayList();
        int value = 0;

        for(char c : commands){
            switch(c){
                case 'i':
                    value++;
                    break;
                case 'd':
                    value--;
                    break;
                case 's':
                    value *= value;
                case 'o':
                    list.add(value);

            }
        }

        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
    public static int countBits(int n){
        // Show me the code!
        String binary = Integer.toBinaryString(n);
        String[] bits = binary.split("");
        System.out.println(Arrays.toString(bits));
        int count = 0;
        for(String b : bits){
            if(b.equals("1"))
                count++;
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
	// write your code here
        int[] sortedArray = new int[] {4, 5, 6};
        int lessThan = 4;
        int result = Arrays.binarySearch(sortedArray,lessThan);
        if(result > 0){
            if(sortedArray.length == 1)
                System.out.println(0);
            System.out.println(result);
        }else
            if(lessThan > sortedArray[sortedArray.length -1])
                System.out.println(sortedArray.length);
            else
                System.out.println(Math.abs(result + 1));

    }
}

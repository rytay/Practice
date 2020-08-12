package com.company;

public class BinarySearch {

    //mid is also root
    public static int recursiveBinarySearch(int arr[], int left, int right, int target){
        if(left <= right){
            int mid = left + (right - left)/2;

            //found
            if(arr[mid] == target)
                return mid;
            //go left
            if(arr[mid] > target)
                return recursiveBinarySearch(arr, left, mid -1, target);
            //go right
            return recursiveBinarySearch(arr, mid +1, right, target);

        }
        //not found
        return -1;
    }

    public static int iterativeBinarySearch(int arr[], int left, int right, int target){

        while(left <= right){
            int mid = left + (right-left)/2;

            //found
            if(arr[mid] == target)
                return mid;
            //go left
            if(arr[mid] > target)
                right = mid - 1;
            //go right
            else
                left = mid + 1;
        }
        //not found
        return -1;

    }

    public static int lessThanBinary(int arr[], int left, int right, int target){
        int mid = -1;
        while(left <= right){
            mid = left + (right-left)/2;
            //found
            if(arr[mid] == target)
                break;
            //go left
            if(arr[mid] > target)
                right = mid - 1;
                //go right
            else
                left = mid + 1;
        }
        //not found
        return mid;
    }



}

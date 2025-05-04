package CyclicSort;

import java.util.Arrays;

//question link: https://leetcode.com/problems/first-missing-positive/
public class firstMissingPositive {
    public static void main(String[] args) {
        int[] num = {0,1,2,3};
        sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(missing(num));
    }
    public static void sort(int[] arr){
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[correct] != arr[i]){
                swap(arr,i , correct);
            }
            else{
                i++;
            }
        }
    }
    static int missing(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if( i + 1 != arr[i]){
                return( i + 1);
            }
        }
        return arr.length + 1;
    }

    public static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

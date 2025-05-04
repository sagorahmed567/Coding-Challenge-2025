package CyclicSort;
// question link: https://leetcode.com/problems/missing-number/
import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missing(arr));
    }
    public static void sort(int[] arr){
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[correct] != arr[i]){
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
        return -1;
    }
    public static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
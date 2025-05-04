package CyclicSort;
// question link: https://leetcode.com/problems/find-the-duplicate-number/
import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(duplicateNumber(arr));
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
    public static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int duplicateNumber(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != (i+1)){
                return arr[i];
            }
        }
        return -1;
    }
}

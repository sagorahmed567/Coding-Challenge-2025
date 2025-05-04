package CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int [] arr = {1,2,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println(misMatchNumber(arr,num));
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
    public static ArrayList<Integer> misMatchNumber(int [] arr, ArrayList<Integer> num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != (i+1)){
                num.add(arr[i]);
                num.add(i+1);
            }
        }
        return num;
    }
}

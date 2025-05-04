package CyclicSort;
// question link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;
import java.util.Arrays;

public class TotalDuplicate {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println(duplicateNumber(arr,num));
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
    public static ArrayList<Integer> duplicateNumber(int [] arr, ArrayList<Integer> num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != (i+1)){
                 num.add(arr[i]);
            }
        }
        return num;
    }
}

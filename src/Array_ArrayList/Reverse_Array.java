package Array_ArrayList;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1,3,4,40,34,5443,233};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void reverseArray(int[] arr){

        //using for loop
//        int j = arr.length-1;
//        for (int i = 0; i < arr.length; i++) {
//            swap(arr,i,j);
//            j--;
//            if(i > j){
//                break;
//            }
//        }

        //using while loop
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}

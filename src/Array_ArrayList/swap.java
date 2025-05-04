package Array_ArrayList;

import java.util.Arrays;
// swap two values in an array
public class swap {
    public static void main(String[] args) {
        int[] arr = {23,2,32,45,56,4};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

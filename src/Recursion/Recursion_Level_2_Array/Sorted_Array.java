package Recursion_Level_2_Array;
// find if an array is sorted or not

public class Sorted_Array {
    public static void main(String[] args) {
       // int [] arr = {2,1,4,6,3};
        int [] arr = {1,2,2};

        boolean ans =  sorted(arr,0);
        System.out.println(ans);
    }
    static boolean sorted(int [] arr,int index){
        if( index == arr.length-1){
            return true;
        }
        return arr[index] <= arr[index+1] && sorted(arr,index+1);
    }
}

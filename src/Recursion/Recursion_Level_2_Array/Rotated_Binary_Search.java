package Recursion_Level_2_Array;

public class Rotated_Binary_Search {
    public static void main(String[] args) {
       // int[] arr =  {5,6,7,8,1,2,3,4};
        int[] arr =  {4,5,1,2,3};
        System.out.println( rotatedBinary(arr,0,arr.length-1,3));
    }
    static boolean rotatedBinary(int[] arr,int start, int end,int target){
        if(start > end){
            return false;
        }
        int mid = start + (end - start) / 2;

        if(target == arr[mid]){
            return true;
        }
        if(arr[start] <= arr[mid]){
            if(target <= arr[mid] && target >= arr[start]){
                return (rotatedBinary(arr,start,mid-1,target));
            }
            return (rotatedBinary(arr,mid+1,end,target));
        }
        if(target >= arr[mid] && target <= arr[end]){
            return rotatedBinary(arr,mid+1,end,target);
        }
        return rotatedBinary(arr,start,mid-1,target);


    }
}

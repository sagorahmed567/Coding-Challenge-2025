package Binary_Search;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {10,34,53,67,70,90,100};
        int target = 100;
        // ceiling = smallest element in an array that is Greater or EQUAL to the target element
        System.out.println("Ceiling of the target is "+findCeiling(arr,target));
    }

    static int findCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else if(target < arr[mid]){
                    end = mid -1;
                }
                else{
                    return arr[mid];// it checks if the mid is equal element because that will be also ceiling
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    return arr[mid]; // it checks if the mid is equal element because that will be also ceiling
                }
            }
        }
        return arr[start]; // this start is the smallest element in the greater than the target
    }
}

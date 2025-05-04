package Binary_Search;

public class floor {
    public static void main(String[] args) {
        int[] arr = {10,34,53,67,70,90,100};
        int target = 99;
        System.out.println("Floor of the target is "+findFloor(arr,target));
    }

    static int findFloor(int[] arr, int target){
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
                    return arr[mid];
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
                    return arr[mid];
                }
            }
        }
        return arr[end];
    }
}

package Binary_Search;

public class Lecture {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,54,5,6,7,67};
        int target = 67;
       // checkNum(arr,target);
        int ans = orderAgnostic_Array( arr,target);
        System.out.println(ans);
    }

    static int orderAgnostic_Array(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];

        while(start <= end) {
            //find the middle element
            int mid = (start + (end - start) / 2);

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    start = mid - 1;
                } else  {
                    end = mid+1;
                }
            }
        }
        return -1;
    }
    static int checkNum(int[] arr, int target){
        int start = 0;
        int end  = arr.length-1;
        while(start <= end) {
            //find the middle element
            int mid = (start + (end - start) / 2);
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}



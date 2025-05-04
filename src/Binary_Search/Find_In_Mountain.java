package Binary_Search;

public class Find_In_Mountain{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;

    }
    static int search(int [] arr,int target){
        int start = 0;
        int end = 1;
        int peak = peakElement(arr,start,end);
        int firstTry = orderAgnostic(arr,target,start,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnostic(arr,target,peak+1,arr.length-1);
    }

    static int peakElement(int [] arr,int start,int end){
        int mid = start + (end - start)/2;
        while(start < end) {
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return  start;
    }
    static int orderAgnostic(int[]arr,int target, int start, int end){
            boolean isAsc = arr[end] > target;
            if(isAsc) {
                while (start <= end) {
                    int mid = start + ( end - start)/2;
                    if(target > arr[mid]){
                        start = mid + 1;
                    }else if (target < arr[mid]){
                        end = mid -1;
                    } else{
                        return arr[start];
                    }
                }
            }else{
                while (start <= end) {
                    int mid = start + ( end - start)/2;
                    if(target > arr[mid]){
                        end = mid - 1;
                    }else if (target < arr[mid]){
                        start = mid +1;
                    } else{
                        return arr[start];
                    }
                }
            }
            return -1;
    }
}

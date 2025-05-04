package Binary_Search;

public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,67};
        int start = 0;
        int end = 1;
        int target = 6;
        int ans = findRange(start,end,arr,target);
        System.out.println(ans);
    }
    static int findRange(int start, int end, int[] arr,int target){

       while(arr[end] < target){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start= newStart;
        }
        return binarySearch(start,end,arr,target);
    }
    static int binarySearch(int start, int end, int [] arr, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid -1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}

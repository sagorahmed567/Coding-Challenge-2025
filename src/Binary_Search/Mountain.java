package Binary_Search;

public class Mountain {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,54,5,6,4,3};
        //System.out.println(peakElement(arr));
        // find an element in mountain array
        int target = 3;
        System.out.println("Index is: "+findInMoutain(arr,target));

    }
    static int findInMoutain(int [] arr, int target){
        int start= 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (  end - start )/2;
            if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return start;
            }
        }
        return -1;
    }
    static int peakElement(int[] arr){
        int start= 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (  end - start )/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else if (arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
        }
        return arr[start];
    }
}

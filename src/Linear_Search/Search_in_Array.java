package Linear_Search;

public class Search_in_Array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,54,32};
        int target = 10;
        System.out.println(linearSearch(arr,target));
        System.out.println(findElement(arr,target));
    }
    static int findElement(int[] arr, int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for(int element: arr){
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    //return the index if found else return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}

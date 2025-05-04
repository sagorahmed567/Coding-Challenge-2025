import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5,7, 9, 9,9,11, 24};
        char[] characterArray = {'a','c','d','f','g'};
        char charTarget = 'z';
        int target = 7;
        int ceilingAns = findCeiling(arr, target);
        int floorAns = findFloor(arr,target);
        char charAns = smallestChar(characterArray,charTarget);
        int[] ans = firstLastPosition(arr,target);
        System.out.println(Arrays.toString(ans));

 //       System.out.println("Smallest character of the array is: "+charAns);
//        System.out.println("Floor of the answer is: "+floorAns);
//        System.out.println("Ceiling of the answer is: "+ceilingAns);
    }



    static int[] firstLastPosition(int[]arr, int target){
        //Question link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//int[] arr = {2, 3, 5, 9,7, 9, 11, 24};

        int [] ans = {-1,-1};
        int start = 0;
        int end = arr.length-1;
        ans[0] = findIndexValue(arr,target,true);
        ans[1] = findIndexValue(arr,target,false );
        return ans;

    }
    static int findIndexValue(int[] arr, int target, boolean findFirstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else if(target < arr[mid]){
                    end = mid -1;
                }
                else{
                   ans = mid;
                   if(findFirstIndex){
                       end = mid -1;
                   } else{
                       start = mid + 1;
                   }
                }

                }
        return ans;
    }
    static char smallestChar(char[] characterArray, char charTarget){
//  Question link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
        // finding the smallest character greater than the target
        int start = 0;
        int end =  characterArray.length-1;

        while(start < end){
            int mid = start + (end -start) / 2;
                if( charTarget <  characterArray[mid]){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
        }

//        if(characterArray[start] < charTarget){
//            return characterArray[0];
//        } else {
//            return characterArray[start];
//        }

        // we can do this in one line
        return characterArray[start % characterArray.length];
    }
    static int findFloor(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end -start) / 2;
            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                } else if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    return arr[mid];
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else if(target > arr[mid]){
                    end = mid -1;
                }else{
                    return arr[mid];
                }
            }
        }
        return arr[end];
    }
    static int findCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if(isAsc) {
                if (arr[mid] < target ) {
                    start = mid + 1;
                } else if(arr[mid] > target) {
                    end = mid -1;
                }else {
                    return arr[mid];
                }
            }

            else{
                if (arr[mid] < target ) {
                    end = mid - 1;
                } else if(arr[mid] > target) {
                    start = mid + 1;
                }else {
                    return arr[mid];
                }
            }
        }
       return arr[start];
    }
}

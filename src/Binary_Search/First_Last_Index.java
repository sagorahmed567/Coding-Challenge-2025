package Binary_Search;

import java.util.Arrays;

public class First_Last_Index {
    public static void main(String[] args) {
    int [] nums = {0,0,7,1,2,7,7};
    int target = 9;
     int[] a = startLastIndex(nums,target);
        System.out.println(Arrays.toString(a));
    }

    static int[] startLastIndex(int[] nums,int target){
        int [] ans = {-1,-1};
//check for first occurrence if target is first
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
       return  ans;
    }

    //this function just return the index value of target
    static int search(int[] nums,int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while( start<= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid -1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else{
                //Potential and is found
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}

package Array_ArrayList;

// Question Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

/*
I've used two pointer method. j is for keep tracking of the unique elements.
Here in the loop nums[i] is comparing the value with it's previous value. If it's the same then it's not an unique element.
Otherwise, we swap the unique value with the increase the jth value by one and swap with it with index of i.
as a result we can serial the unique elements with serially .
* */

import java.util.Arrays;

public class Problem_27 {
    public static void main(String[] args){
        int[] nums = {0,0,1,1,2,2,3,3,4 };
        int j = 0;
        for(int i  = 1; i < nums.length; i++){
            if(nums[i] != nums[j]){
                j+=1;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Unique elements "+ (j+1));
    }
    
}

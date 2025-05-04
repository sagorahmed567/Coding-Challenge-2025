package Recursion_Level_2_Array;

//Question link: find if an element exist in the  array or not

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {


        // return target
        // return the target index
        // search from the item from the back
        int[] arr = {1, 2, 3, 4, 5};
        int target = 2;
        System.out.println(findBoolean(arr, target, 0));
        System.out.println(findIndex(arr,target,0));
        System.out.println(findIndexFromBack(arr,target,arr.length-1));


/*         For repeated element return all the index using ArrayList ,
               First: ArrayList as an argument
               Second: ArrayList in a body
*/
        // First
        int [] repeated_element_InArray = {1, 2, 2,2,3, 4, 5};
        //ArrayList<Integer> list = new ArrayList<>();
        // I can also create this in the parameter
        System.out.println(findAllIndex1(repeated_element_InArray,new ArrayList<>(),target,0));

        // Second : Here I won't pass the ArrayList in the parameter Rather I'll create the ArrayList in the body
        System.out.println(findAllIndex2(repeated_element_InArray,target,0));

    }
    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(target == arr[index]){
            list.add(index);
        }
        ArrayList<Integer> ans = findAllIndex2( arr, target,index+1);
        list.addAll(ans);
        return list;

    }

    static ArrayList<Integer> findAllIndex1(int[] arr, ArrayList<Integer> list,int target,int index){
        if(index == arr.length){
            return list;
        }
        if(target == arr[index]){
            list.add(index);
        }

        return findAllIndex1( arr, list, target,index+1);

    }

    static boolean findBoolean(int[]arr, int target, int index){
        if(index == arr.length){
            return false;
        }
//        if(target == arr[index]){
//            return true;
//        }

        // I can merge this if condition with recursion
        return target == arr[index] || findBoolean( arr, target,index+1);
    }

    static int findIndex(int[]arr, int target, int index){

        if(index == arr.length){
            return -1;
        }

        if(target == arr[index]){
            return index;
        }



        return findIndex( arr, target,index+1);
    }
    static int findIndexFromBack(int[]arr, int target, int index){

        if(index == arr.length){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        return findIndex( arr, target,index-1);
    }

}

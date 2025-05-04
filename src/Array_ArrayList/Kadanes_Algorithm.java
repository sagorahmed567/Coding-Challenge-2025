package Array_ArrayList;
import java.util.ArrayList;

public class Kadanes_Algorithm {
    public static void main(String[] args) {
        int[] arr = {1, -2,3};

        // I am printing all the subarrays first
        ArrayList<ArrayList<Integer>> ans = subArrays(arr);
        System.out.println(ans);
    }
        static ArrayList<ArrayList<Integer>> subArrays(int[] arr){
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        for(int start = 0; start < arr.length; start++){
            for(int end = start; end < arr.length; end++){
                ArrayList<Integer> list1 = new ArrayList<>(1);
                for(int i = start; i <= end; i++ ){
                    list1.add(arr[i]);
                }
                System.out.print(list1+" ");
                list2.add(list1);
            }
            System.out.println();
        }
        return list2;
    }
}

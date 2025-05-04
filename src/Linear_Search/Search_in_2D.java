package Linear_Search;
import java.util.Arrays;

public class Search_in_2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {33,23,45}, {89,65,83,89}};
        int target = 89;
        int[] ans = search2D(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[]  search2D(int[][] arr,int target){

        //return the row and column num of the target as an array
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}

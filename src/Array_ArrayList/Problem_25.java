package Array_ArrayList;

import java.util.Arrays;

//Question Link: https://leetcode.com/problems/reshape-the-matrix/description/
public class Problem_25 {
    public static void main(String[] args) {
        int [][] mat = {{1,2},{3,4}};
        int row = 2, col = 4;
        int elements = 0;

        // find total elements of array
        for(int i = 0; i < mat.length; i++){
            elements += mat[i].length;
        }

        if(elements == row*col) {

            // First create an 1D Array
            int k = 0; // it'll keep track of 1D array
            int[] OneD_Array = new int[elements];
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    OneD_Array[k] = mat[i][j];
                    k += 1;
                }
            }
            System.out.println(Arrays.toString(OneD_Array));

            // create an array that is asked in the question because we'll now insert the value of 1D array into the intended array
            int[][] reshaped_array = new int[row][col];
            int x = 0; // it's 1D array iterator
            for (int i = 0; i < reshaped_array.length; i++) {
                for (int j = 0; j < col; j++) {
                    reshaped_array[i][j] = OneD_Array[x];
                    x++;
                }
            }
            System.out.println(Arrays.deepToString(reshaped_array));
        }
        else{
            //return the original array because the reshaped won't be possible
            System.out.println(Arrays.deepToString(mat));
        }
    }
}

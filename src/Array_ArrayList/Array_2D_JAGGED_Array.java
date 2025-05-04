package Array_ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_2D_JAGGED_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        System.out.println(checkType(10));
//        System.out.println( checkType("10"));


       // int[][] arr = new int[3][];
       // int[][] arr = new int[][]{{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        int[][] arr ={{1, 2},{1, 2, 3}, {1, 2, 3, 4}};//

        // Output
//        System.out.println("Length of the arr which GIVES the column number : "+ arr.length);
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }


        //output with for each loop
        for(int[] element:arr){
          //  System.out.println(Arrays.toString(element)); // it prints the whole array

            // It prints all the elements one by one
//            for (int i = 0; i < element.length; i++) {
//                System.out.print(element[i]+" ");
//            }
            System.out.println();
        }

        //output
//        for(int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


//        int[][] arr = new int[3][3];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//
    //




// // JAGGED Array
//
        //initializing array
//        int [][] arr = new int [3][];
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println("Enter the number of column for row no: "+(row+1));
//            int size = sc.nextInt();
//            arr[row] = new int[size];
//        }
//
////         Taking input
//        System.out.println("Enter  of inputs for array");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//       //printing output
//        for (int i = 0;
//             i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }




    }
    static String checkType(int num){
            return "Integer value";
    }
    static String checkType(String val){
        return "String value";
    }
}


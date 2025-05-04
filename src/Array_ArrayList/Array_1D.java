package Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Array_1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String[] roll = new String[5];
        int[] arr = new int[5];

//        arr[1] = 1;
//        arr[2] = 2;
//        arr[3] = 3;
//        System.out.println(arr[3]);


        //Taking Input
//       for(int i = 0; i < 5; i++){
//           arr[i] = sc.nextInt();
//       }

//          first way to output
//       for(int i = 0; i < 5; i++){
//           System.out.print(arr[i]+" ");
//       }


//         Second way to output
//        for(int i:arr){
//            System.out.println(arr[i]+" .");
//        }

//        Third way to output
            System.out.println(Arrays.toString(arr)); // it directly prints the whole array in STRING form.

    }
}

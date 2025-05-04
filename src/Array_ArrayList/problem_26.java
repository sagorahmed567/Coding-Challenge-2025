package Array_ArrayList;

// Question: https://leetcode.com/problems/plus-one/

import java.util.Arrays;
//  Approach -01:
//this approach first

public class problem_26 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int len = digits.length;
        // this function converts the array into a number form
        int integer_value = increment(digits);
        int incremented_sum = integer_value + 1;

        //  this function decompose the incremented number into digits and then make it an array
        int[] arr = decompose(incremented_sum,len);
        System.out.println(Arrays.toString(arr));



        // second approach : I can run a loop through the array and make the numbers into string form then i'll turn the string into int and then increment one then again decompose and convert into an array
        System.out.println("This is the second approach converting into String");
        String num ="";
        for(int i = 0; i < digits.length; i++){
            num += integerToString(digits[i]); // string value
        }
        int convertedIntegerNumber =stringToInteger(num) + 1; // Integer value
        int [] second_approach_array = decompose(convertedIntegerNumber,len);
        System.out.println(Arrays.toString(second_approach_array));
    }

    static int stringToInteger(String str){
        return Integer.parseInt(str);
    }
    static String integerToString( int num){
        return String.valueOf(num);
    }


        static int increment(int [] digits){
            int sum = 0;
            int track = 1;
        for(int i = digits.length-1; i >= 0; i--){
            if(i ==  digits.length-1){
                sum += digits[i] * track;
            }
            else {
                track *= 10;
                sum += digits[i] * track;
            }
        }
            return sum;
    }
    static int[] decompose(int num,int len){
        int [] modified_array = new int[len];
        int i = len-1;
        while( num != 0){
            int rem = num % 10;
            num = num  / 10;

           modified_array[i] = rem;
          i--;
        }
        return modified_array;
    }




}

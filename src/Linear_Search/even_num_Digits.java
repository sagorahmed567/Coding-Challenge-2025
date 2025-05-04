package Linear_Search;
import java.util.ArrayList;

// find how many even num digits exist in the array.
public class even_num_Digits {
    public static void main(String[] args) {
        int[] arr = {134,-2673,34123,423,12};
        System.out.println(evenDigits(arr));
    }


    static ArrayList<Integer> evenDigits(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < arr.length;i++){
            if(digits(arr[i]) % 2 == 0){
                list.add(arr[i]);
                count++;
            }
        }
        System.out.println(count);
        return list;
    }


//    static int evenDigits(int[] arr){
//        int count = 0;
//        for(int element: arr){
//             if(digits(element) % 2 == 0){
//                 count++;
//             }
//        }
//        return count;
//    }
    static int digits(int num){
        int digit_count = 0;
        while(num > 0){
            num = num /10;
            digit_count++;
        }
        return digit_count;
    }
    static int optimized_evendigits(double num){
        return (int)(Math.log10(num)+1);
    }
}

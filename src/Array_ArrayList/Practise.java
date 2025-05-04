package Array_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
public class Practise {
        public static void main(String[] args) {
            int[] arr = {1, -2, 2, 3, 4, 5};
            ArrayList<Integer> list = new ArrayList<>(4);
            for (int start = 0; start < arr.length; start++) {
                for (int end = start; end < arr.length; end++) {
                    for (int i = start; i <= end; i++) {
                        System.out.print(arr[i]);
                    }
                    System.out.print(" ");
//                        list.add(arr[i]);
//                    }
//                    System.out.print(list);
//                    System.out.print(" ");
//                    list.clear();
//                 }
//                System.out.println();
                }
                System.out.println(" ");
            }
        }
}

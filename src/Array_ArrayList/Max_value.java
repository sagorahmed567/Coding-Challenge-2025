package Array_ArrayList;

public class Max_value {
    public static void main(String[] args) {
        int[] arr = {1,3,4,40,34,5443,233};
        System.out.println(maxVal(arr));
    }
    static int maxVal(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}

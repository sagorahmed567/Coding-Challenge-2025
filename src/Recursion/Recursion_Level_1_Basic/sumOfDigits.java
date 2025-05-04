package Recursion_Level_1_Basic;

public class sumOfDigits {
    public static void main(String[] args) {

        int ans = sum(123456);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n%10+sum(n/10);
    }
}

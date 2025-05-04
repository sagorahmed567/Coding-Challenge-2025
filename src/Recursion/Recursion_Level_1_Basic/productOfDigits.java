package Recursion_Level_1_Basic;

public class productOfDigits {
    public static void main(String[] args) {
        int ans = product(101);
        System.out.println(ans);
    }
    static int product(int n){
        if(n == 0){
            return 1;
        }
        return n%10 * product(n/10);
    }
}

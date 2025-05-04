package Recursion_Level_1_Basic;

public class reverseNumber {

    // QUESTION - 07

   static int sum = 0;
    public static void main(String[] args) {
        //way-1

      //way-2
        int ans = reverse2(123);
        System.out.println(ans);
        System.out.println(palindrome(12321));
    }
static void reverse1(int n ){
    if(n == 0){
        return;
    }
    int rem = n % 10;
    sum = sum * 10 + rem;
    reverse1(n/10);
}
//way - 2: using another helper function.
static int reverse2(int n){
        int digits = (int) Math.log10(n)+1;
        return helper(n,digits);
}
static int helper(int n, int digits){
        if(n == 0){
            return 0;
        }
        return n % 10 * (int) Math.pow(10,digits-1) + helper(n/10,digits-1);
}

// QUESTION - 08
static boolean palindrome(int n){
        return (n == reverse2(n));
}
}

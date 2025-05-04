package Recursion_Level_1_Basic;
//task4
public class productOf1ToN {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }
}

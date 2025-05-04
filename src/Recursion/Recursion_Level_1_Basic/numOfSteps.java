package Recursion_Level_1_Basic;

//question link : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

public class numOfSteps {
    public static void main(String[] args) {
        int ans = steps(41);
        System.out.println(ans);
    }
    static int steps(int n){
        return helper(n, 0);
    }
    static int helper(int n, int step){
        if(n == 0){
            return step;
        }
        if(n % 2 == 0){
           return helper(n / 2,step+1);
        }
       return helper(n-1,step+1);
    }
}

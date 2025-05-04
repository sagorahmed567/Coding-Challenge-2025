package Recursion_Level_1_Basic;

// QUESTION - 09
public class countZeros {
    static int c = 0;
    public static void main(String[] args) {
        // way - 01
        count1(10203);
        System.out.println(c);

        // way - 02
        System.out.println(count2(10293000));
    }


    static void count1(int n){
       int rem = n % 10;
       if (n == 0){
           return;
       }
       if(rem == 0){
           c += 1;
       }
       count1(n/10);
    }


    static int count2(int n){
        return helper(n,0);
    }
    static int helper(int n, int tracker){
        if(n == 0){
            return tracker;
        }
        int rem = n % 10;
        if(rem == 0){
            return helper(n/10,tracker+1);
        }
        return helper(n/10,tracker);
    }
}

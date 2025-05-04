package Recursion_Level_1_Basic;

public class Nto1 {
    //task1
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}

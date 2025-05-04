package Method;

import java.util.Scanner;
public class primeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(primeCheck(num));
    }
    static String primeCheck(int num){

        for(int i =2; i < num; i++){
            if(num % i == 0){
                return "Not Prime number";
            }
        }
        return "Prime Number";
    }
}

package Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // armstrong check
        System.out.println(armstrong(num));
        //printing armstrong of 3 digits

        ArrayList<Integer> armstrong_list = new ArrayList<>();
//        printArmstrong(armstrong_list);
//        System.out.println(armstrong_list);
//
    }

    static boolean armstrong(int num){
        int count = 0;
        double sum = 0;
        int original = num;
        int temp =  num;
        // counting digits
        while(num > 0) {
            int rem = num % 10;
            count+=1;
            num = num / 10;
        }

        // checking armstrong cond.
        while(temp > 0) {
            int rem = temp % 10;
            sum+=Math.pow(rem,count);
            temp = temp / 10;
        }
        return original == sum;

    }


    static void printArmstrong(ArrayList<Integer> list){
        for (int i = 100; i < 1000; i++) {
            if(armstrong(i)){
                list.add(i);
            }
        }
    }
}

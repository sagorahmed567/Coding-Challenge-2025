package Array_ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list  = new ArrayList<>(10);
//        list.add(10);
//        list.add(100);
//        System.out.println(list);

//        list.add(300);
//        list.add(7625);
//        System.out.println(list);
//        System.out.println(list.contains(76));
//        list.set(1,500);
//        System.out.println(list);
//        list.remove(2);

//        for (int i = 0; i < 3; i++) {
//            list.add(sc.nextInt());
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }


       // It creates an outer list for example bookshelf without any shelves
        ArrayList<ArrayList<Integer>> outerlist = new ArrayList<>();

        //initialize
        for (int i = 0; i < 3; i++) {
            // It creates the shelves inside the bookshelf as in the Inner arraylist
            outerlist.add(new ArrayList<>());
        }

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 4; j++) {
                outerlist.get(i).add(sc.nextInt());
            }
        }

        // output
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < outerlist.get(i).size(); j++) {
                System.out.print(outerlist.get(j)+" ");
            }
        }

    }
}

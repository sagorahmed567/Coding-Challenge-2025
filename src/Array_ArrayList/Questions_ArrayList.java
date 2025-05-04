package Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;


public class Questions_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //create an arraylist, add some numbers and then print it
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(121);
        list.add(120);
        list.add(1100);
        System.out.println(list);
        int end = list.size()-1;
        for (int start = 0; start < list.size(); start++) {
           swap(list,start,end);
           end--;
           if(start>end){
               break;
           }
        }
        System.out.println(list);


        // create a 2D ArrayList, add 3 inner list, each containing 5 elements in it.
//        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            list1.add(new ArrayList<>());
//        }
//
//        for (int i = 0; i < list1.size(); i++) {
//            for (int j = 0; j < 5 ; j++) {
//                list1.get(i).add(sc.nextInt());
//            }
//        }
//        System.out.println(list1);



        // create a STRING arrayList, remove an element and print it
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Sagor");
//        list.add("Ali");
//        list.add("Ahmed");
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
    }
    static void swap(ArrayList<Integer> list,int a,int b){
        int temp = list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }


}

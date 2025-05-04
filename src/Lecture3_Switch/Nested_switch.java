package Lecture3_Switch;

import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EmpId = sc.nextInt();
        String Department = sc.next();

//        switch(EmpId){
//            case 1 -> System.out.println("Sager");
//            case 2 -> System.out.println("Ahmed");
//            case 3 -> {
//                switch (Department) {
//                    case "IT" -> System.out.println("From IT department");
//                    case "Bilogy" -> System.out.println("From Biology Department");
//                    default -> System.out.println("Not from any department");
//                }
//            }
//            default -> System.out.println("Don't belong here");
//
//        }

        switch (EmpId) {
            case 1:
                System.out.println("Sager");
                break;
            case 2:
                System.out.println("Ahmed");
                break;
            case 3:
                switch (Department) {
                    case "IT":
                        System.out.println("From IT department");
                        break;
                    case "Bilogy":
                        System.out.println("From Biology Department");
                        break;
                    default:
                        System.out.println("Not from any department");
                }
                break;
            default:
                System.out.println("Don't belong here");
        }
    }
}

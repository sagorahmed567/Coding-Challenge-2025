package Lecture3_Switch;

/*
### Multiple line inside an enhanced switch case use the curly braces..Watch the problem opn nested switch part
Instead of writing many if..else statements, you can use the switch statement.

The switch statement selects one of many code blocks to be executed:
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
The switch expression is evaluated once.
The value of the expression is compared with the values of each case.
If there is a match, the associated block of code is executed.
The break and default keywords are optional, and will be described later in this chapter.
The expression and the case values have to be same type.


 */
import java.util.Scanner;
public class Describing_Fruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
//        switch(fruit) {
//            case "apple":
//                System.out.println("Red fruit");
//                break;
//            case "mango":
//                System.out.println("King of fruit");
//                break;
//            case "guava":
//                System.out.println("Gives much protein than the apple");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit name");
//        }
        switch (fruit){
            case "apple" -> System.out.println("Red fruit");
            case "mango" -> System.out.println("King of fruit");
            case "Orange" -> System.out.println("Tastes sour");
            default -> System.out.println("Please enter a valid fruit name");
        }


    }
}
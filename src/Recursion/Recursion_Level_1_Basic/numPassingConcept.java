package Recursion_Level_1_Basic;

public class numPassingConcept {
    public static void main(String[] args) {
        pass(5);
    }
    static void pass(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        // pass(n--);
        pass(--n);
        // >>>>> we'll get face StackOverflow because this is post increment.
        // Here, in post decrement, first the value will be passed then decrement happens. So, when 5 is passed into the function
        // as per post increment rule , when the value is passed after the value is passed it won't get the chance to decrement
        // so, we'll get stack overflow

    }
}

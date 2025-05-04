package Lecture3_Switch;

public class pasbyvalue {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String name){
        name = "Rahul Rana";
    }
}

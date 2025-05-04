package Linear_Search;

import java.util.Arrays;

public class Search_in_String {
    public static void main(String[] args) {
        String name = "sagor";
        char target = 's';
        //System.out.println(characterSearch1(name,target));
        //System.out.println(characterSearch2(name,target));

        System.out.println(Arrays.toString(name.toCharArray()));


    }
    static boolean characterSearch2(String name, char target){
        if(name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean characterSearch1(String name, char target){
        if(name.length() == 0){
            return false;
        }
        for(char ch: name.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}

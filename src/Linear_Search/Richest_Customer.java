package Linear_Search;

public class Richest_Customer {
    public static void main(String[] args) {
    char [] letters = {'x','x','y','y'};
    char target = 'z';
        System.out.println(charCheck(letters,target));
    }
     static char charCheck(char[] letters,char target){
        int start = 0;
        int end = letters.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            }else if(target > letters[mid]){
                start = mid + 1;
            }
//        }if(target > letters[end]){
//            return letters[0];
//        }else{
//            return letters[start];
//        }
        }
         if(start == letters.length){
             return letters[0];
         }else{
             return letters[start];
         }
    }
}

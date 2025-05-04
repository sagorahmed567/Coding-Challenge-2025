package Linear_Search;

public class Search_in_Rage {
    public static void main(String[] args) {
        int[] arr = {19,20,37,48,54,53,100,200,600};
        int start = 2;
        int end = 6;
        int target = 98;
        System.out.println(searchRange(arr,start,end, target));
    }
    static boolean searchRange(int[] arr,int start, int end, int target){
        if(arr.length < end){
             return false;
        }
        for (int i = start; i <= end ; i++) {
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }
}

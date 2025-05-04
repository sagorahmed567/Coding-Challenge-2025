public class Pattern {
    public static void main(String[] args) {
        //pattern1(5);pattern2(5);pattern3(5);pattern4(5);pattern5(5);pattern6(5);pattern7(5);pattern8(5);pattern9(5);pattern10(5);pattern11(5);pattern12(5);pattern13(5);pattern14(5);pattern15(5);pattern18(5);pattern19(5); pattern20(5);pattern21(5);pattern22(5);pattern26(6);pattern28(5);pattern32(5);pattern33(7);pattern34(5);pattern30(5);
        pattern17(4);
        pattern30(5);
    }
    static void pattern1(int n){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern2(int n){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 0; i < n*2-1; i++) {
            if (i < 4) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for (int j = i; j < n*2-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    static void pattern6(int n){
        //printing the space
//        for (int i = 0; i < n; i++) {
//            // printing spaces
//            for (int j = i; j < n-1; j++) {
//                System.out.print(" ");
//            }
//      //printing asterics
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Shorter Version with just one inner loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j < n-(i+1)) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }

    static void pattern7(int n){
//        for (int i = 0; i < n; i++) {
//            // printing space
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            //printing asterics
//            for (int j = i; j < n-1 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// Shorter Version
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j < i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int i = 0; i < n; i++) {
          //printing space
            for (int j = i; j < n-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (i+1) -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int i = 0; i < n; i++) {
            //printing space
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (n * 2)-(2 * (i+1)-1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n){
        for (int i = 0; i < n; i++) {
            //printing space
            for (int j = i; j < n-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
   public static void pattern11(int n){
        for (int i = 0; i < n; i++) {
            //printing space
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        // first way
//      pattern11(n);
//      pattern10(n);
       // second way

        int c = 1;
        for (int i = 0; i < n*2; i++) {
            for (int j = 0; j < n; j++) {
                //it'll check till 5th row
                if(i < 5){
                    //it'll print the space and the element
                    if(j < i){
                        System.out.print(" ");
                    }else{
                        System.out.print("* ");
                    }
                }else{
                    if(j < n - c){
                        System.out.print(" ");
                    }else{
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
            if(i >= 5){
                c++;
            }
        }
    }

    static void pattern13(int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
            if(i < 4) {
                for (int j = 0; j < 2*(i+1)-1; j++) {
                    if(j == 0 || j == 2*(i+1)-2){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }else{
                for (int j = 0; j < n*2 -1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n * 2)-(2 * (i+1)-1) ; j++) {
                if(i == 0){
                    System.out.print("*");
                }else{
                    if(j ==0 || j == (n * 2)-(2 * (i+1))){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        int c = 3;
        for (int i = 0; i < n*2; i++) {
            if(i < 5) {
                //print space
                for (int j = i; j < n - 1; j++) {
                    System.out.print(" ");
                }
                //printing the pattern upto 5th row
                for (int j = 0; j < 2*(i+1)-1; j++) {
                    if(j==0 || j==2*(i+1)-2){
                        System.out.print("* ");
                    }else{
                        System.out.print(" ");
                    }
                   
                }
            }else{

                // space in the lower part
                for (int j = n; j < i+1  ; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n*2-c; j++) {
                    if(j == 0 || j == n*2-c-1 ) {
                        System.out.print("* ");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            if(i > 4) {
                c += 2;
            }
        }
    }

    static void pattern19(int n) {
        for (int i = 0; i < n*2-1; i++) {
            if (i < 5) {
                for (int j = 0; j < n * 2; j++) {
                        if (j < i + 1) {
                            System.out.print("*");
                        } else if (j >= (i + 1) && j < (n * 2) - (i + 1)) {
                            System.out.print(" ");
                        } else if (j > (n * 2) - (i + 2)) {
                            System.out.print("*");
                        }
                }
            }
            else{
                for (int j = 0; j < n*2; j++) {
                    int x = (n*2)-(i+1);//4
                    if(j < x){
                        System.out.print("*");
                    }else if(j >= x && j < i+1){
                        System.out.print(" ");
                    }else if(j >= i+1){
                        System.out.print("*");
                    }
                }
            }

            System.out.println();
        }
    }
    public static void pattern20(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(i == 0 || i == n-1 ){
                    System.out.print("*");
                }else{
                    if (j == 0 || j == n-2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
////     //not completed
//    static void pattern16(int n){
//        int c = 2;
//        int x = 1;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n*2-c; j++) {
//                System.out.print(".");
//            }
//            // each iteration increase by 4
//            for (int j = 0; j < x; j++) {
//                if (j == 0 || j == x-1){
//                    System.out.print(1+"   ");
//                }
//
//            }
//
//            c+=2;
//            System.out.println();
//        }
//    }
    static void pattern21(int n){
        int x = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();

        }
    }
    static void pattern22(int n){
        for (int i = 0; i < n; i++) {
            int pointer1 = 0;
            int pointer2 = 1;
            for (int j = 0; j <= i; j++) {
                if(i % 2 == 0){
                    System.out.print(pointer2+" ");
                    pointer2++;
                    if(pointer2 > 1){
                        pointer2 = 0;
                    }
                }else{
                    System.out.print(pointer1+" ");
                    pointer1++;
                    if(pointer1 > 1){
                        pointer1 = 0;
                    }
                }
            }
            System.out.println();
        }
    }
    static void pattern26(int n){
        int tracker = n;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < tracker ; j++) {
                System.out.print(i+1+" ");
            }
            tracker--;
            System.out.println();
        }
    }
//    static void pattern27(int n){
//        int tracker = 1;
//        for (int i = 0; i < n-1 ; i++) {
//            //space
//            for (int j = 0; j < i ; j++) {
//                System.out.print("..");
//            }
//            for (int j = 0; j < n-(i+1); j++) {
//                System.out.print(tracker+" ");
//                tracker++;
//            }
//
//            int x = n* (n-1);
//            for (int j = 0; j < n-(i+1); j++) {
//                if(j == 0) {
//                     x = x - (n - (j + 3)); //17
//                }
////                if(j == n-(i+2)){
////
////                }
//                System.out.print(x- (n-(j+2))+ " ");
//            }
//            System.out.println();
//
//        }
//    }
    static void pattern32(int n) {
        int upper = (char) (65 + (n - 1));
        for (int i = 0; i < n; i++) {
            int lower = upper - i;
            for (int j = lower; j <= upper; j++) {
                System.out.print((char) (j) + " ");

            }
            System.out.println();
        }
    }
    static void pattern33(int n){
        int lower = 97;
        int upper = 0;
        for (int i = 0; i < n; i++) {
            if(i == 0) {
                 upper = lower + i;
                for (int j = lower; j <= upper; j++) {
                    System.out.print((char) j+" ");
                }
                lower = upper+1;
            }else{
                upper = lower + i+1;
                for (int j = lower; j < upper; j++) {
                    if(j > 122){
                        System.out.print("*");
                        break;
                    }
                    if(j % 2 == 0) {
                        System.out.print((char) (j-32) + " ");
                    }else{
                        System.out.print((char) j + " ");
                    }

                }
                lower = upper;
            }


            System.out.println();
        }
    }
    static void pattern34(int n){
    int lower = 65;
        for (int i = 0; i < n; i++) {
            int upper = lower+(n-(i+1));
            for (int j = upper ; j >= lower ; j--) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
  
    static void pattern28(int n) {
        for (int row = 0; row < 2 * n-1 ; row++) {
            int totalCol = row > n-1 ? 2*n- (row+1):row+1;
            //space
            int numOfSpaces = n - totalCol;
            for (int space = 0; space < numOfSpaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalCol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern18(int n){
    int counter = 2;
        for (int i = 0; i < 2*n; i++) {
           if(i < 5){
               for (int j = i; j < n; j++) {
                   System.out.print("*");
               }
               for (int j = 0; j < 2*i; j++) {
                   System.out.print(" ");
               }  for (int j = i; j < n; j++) {
                   System.out.print("*");
               }
           }

           else{
               for (int j = n; j <= i ; j++) {
                   System.out.print("*");
               }
               for (int j = 0; j < 2*n - counter; j++) {
                   System.out.print(" ");
               }
               for (int j = n; j <= i ; j++) {
                   System.out.print("*");
               }
               counter += 2;
           }
            System.out.println();

        }
    }
    static void pattern30(int n){

        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n-(i+1) ; j++) {
                System.out.print("  ");
            }
            for (int j = i+1; j > 0 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i+1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
    int c = 1;
    int tracker = 1;
    int last = 1;
        for (int i = 0; i < 2*n-1; i++) {
            if(i < n) {
                for (int j = 0; j < n-(i+1); j++) {
                    System.out.print(" ");
                }
                for (int j = i+1; j > 0 ; j--) {
                    System.out.print(j);
                }
                for (int j = 2; j <= i+1; j++) {
                    System.out.print(j);
                }
            }
            else{
                //space
                for (int j = 0; j < n-(n-c); j++) {
                    System.out.print(" ");

                }
                for (int j = n-tracker; j > 0 ; j--) {
                    System.out.print(j);
                }
                for (int j = 2; j <= n-(last); j++) {
                    System.out.print(j);
                }

                c++;
                tracker++;
                last++;

            }
            System.out.println();
        }
    }



}

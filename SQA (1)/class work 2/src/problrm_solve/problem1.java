package problrm_solve;

import java.util.Scanner;

public class problem1 {
    //public void pal (String s){
    public static boolean  pal(String s ){

        int left = 0 ;
        int right = s.length()-1;
        while( left<right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
//            else {
                left++;
                right--;

//            }
        }
       return true;

    }

    public static void main(String[] args) {
        problem1 pm = new problem1();
        Scanner sc = new Scanner(System.in);
        for ( ; ; ) {
            System.out.println("Enter the word: ");
            String ss = sc.nextLine();
            pm.pal(ss);
        if (pal(ss)){
            System.out.println( ss  + " : This is palindrom");
        }
        else {
            System.out.println(ss + ": This is not palindrom");
        }


        }
    }
}


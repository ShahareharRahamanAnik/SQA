package problrm_solve;

import java.util.Scanner;

public class problem7 {
    public void count(String str){
        int sum=0;
        for(int i=0; i<str.length(); i++){
         char ch;
            ch = str.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
             sum++;
         }
        }
        System.out.println("total vowel is : " + sum);
    }

    public static void main(String[] args) {
        problem7 pm7= new problem7();
        Scanner sc = new Scanner(System.in);
        for( ; ; ) {
            String s = sc.nextLine();

            pm7.count(s);
        }
    }
}

//package problem_solve;
//
//import java.util.Scanner;
//
//public class problem7 {
//    public void count(String str) {
//        int sum = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                sum++;
//            }
//        }
//        System.out.println("Total vowels: " + sum);
//    }
//
//    public static void main(String[] args) {
//        problem7 pm7 = new problem7();
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//
//        pm7.count(s);
//    }
//}

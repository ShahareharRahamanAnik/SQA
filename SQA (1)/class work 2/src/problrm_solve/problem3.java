package problrm_solve;

import java.util.Scanner;

public class problem3 {
    public void fib(int x){
      int  sum1 = 0 ;
      int sum2 = 1;
      int sum3 ;

        System.out.print("1");
        for (int y = 1 ; y<= x; y++){
           sum3 = sum1 + sum2;
           sum1 = sum2;
           sum2 = sum3;

            System.out.print( ", "+ sum3 );

        }
    }

    public static void main(String[] args) {
        problem3 p3 = new problem3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which till you want a Fibonacci serise: ");
        int sp = sc.nextInt();
        System.out.println("The Fibonacci series is: ");
        p3.fib(sp);

    }
}

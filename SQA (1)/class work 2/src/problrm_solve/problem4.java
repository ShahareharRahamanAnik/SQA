package problrm_solve;
import java.util.Scanner;
public class problem4 {
    public static boolean prime(int n) {
        if(n == 1){
            return false;
        }
        for (int x = 2; x < n; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
            problem4 pm4 = new problem4();
            Scanner ss = new Scanner(System.in);
            for( ; ; ) {
                System.out.println("Input a number:");
                int s = ss.nextInt();
                pm4.prime(s);
                if (prime(s)) {
                    System.out.println("this is a prime number");
                } else {
                    System.out.println("this is not prime number");

                }
            }
        }
    }
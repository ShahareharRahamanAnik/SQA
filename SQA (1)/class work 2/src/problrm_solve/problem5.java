package problrm_solve;
import java.util.Scanner;
public class problem5 {
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
        problem5 pm4 = new problem5();
        Scanner ss = new Scanner(System.in);

            System.out.println("Input a number:");
            int s = ss.nextInt();
            for (int i=1 ; i<= s ; i++) {
                pm4.prime(i);
                if (prime(i)) {
                    System.out.println(i + "  is a prime number");
                } else {
                    System.out.println(i + "  is not prime number");

                }
            }
    }
}



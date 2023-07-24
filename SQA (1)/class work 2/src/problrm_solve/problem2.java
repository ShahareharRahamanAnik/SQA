package problrm_solve;

import javax.script.ScriptContext;
import java.util.Scanner;

public class problem2 {
    public void fact(int x){
        int mul = 1;
        while (  x>=1) {

             mul = mul * x;
             x--;
        }
        System.out.println(" The factorial value is : " + mul );

    }

    public static void main(String[] args) {
        problem2 pm = new problem2();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any number: ");
        int sp = sc.nextInt();
        pm.fact(sp);
    }
}

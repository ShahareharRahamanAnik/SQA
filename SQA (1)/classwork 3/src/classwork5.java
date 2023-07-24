package classwork5;
import java.util.Scanner;
public class classwork5 {

    public int add(int x, int y){
        int sum = x+y;
        System.out.println("the sum is :" +sum);
        return(sum);
    }

    public void div(int x, int y){
        double div = (double) x/y;
        System.out.println("the division :" +div);
    }

    public static void main(String[] args) {
        classwork5 c = new classwork5();
        // System.out.println("please input  a num");

        Scanner sc = new Scanner(System.in);
        System.out.println("please input  a num:");
        int f = sc.nextInt();
        //System.out.println("your input num is: " +f);

        System.out.println("please input another  a num:");
        int h = sc.nextInt();
        //System.out.println("your input another num is: " +h);
         int k = c.add(f, h);


        System.out.println("please input another  a num by which should be divided:");
        int w = sc.nextInt();
        c.div(k,w);
    }
}

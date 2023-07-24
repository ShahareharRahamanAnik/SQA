package classwork4;

import java.util.Scanner;

public class classwork4 {

    public void add(int x, int y){
        int sum = x+y;
        System.out.println("the sum is :" +sum);
    }
    public void sub(int x, int y){
        int sum = x-y;
        System.out.println("the subtraction is :" +sum);
    }
    public void mul(int x, int y){
        int sum = x*y;
        System.out.println("the multiplication is :" +sum);
    }
    public void div(int x, int y){
        float sum = (float)x/y;
        System.out.println("the division :" +sum);
    }

    public static void main(String[] args) {

        classwork4 c = new classwork4();
       // System.out.println("please input  a num");

        Scanner sc = new Scanner(System.in);
        System.out.println("please input  a num:");
        int f = sc.nextInt();
        //System.out.println("your input num is: " +f);

        System.out.println("please input another  a num:");
        int h = sc.nextInt();
        //System.out.println("your input another num is: " +h);

        c.add(f,h);
        c.sub(f,h);
        c.mul(f,h);
        c.div(f,h);
    }
}

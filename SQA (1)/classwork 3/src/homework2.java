package homework2;
import java.util.Scanner;
public class homework2 {

    public int add(int x, int y){
        int sum = x+y;
        System.out.println("the sum is :" +sum);
        return(sum);
    }

    public int sub(int x, int y){
        int sum = x-y;
        System.out.println("the sum is :" +sum);
        return(sum);
    }
    public float div(int x, int y){
        float sum = (float)x/y;
        System.out.println("the sum is :" +sum);
        return sum;
    }
    public int mul(int x, int y){
        int sum = x*y;
        System.out.println("the sum is :" +sum);
        return sum;
    }
public void addd(float x, float y, float z, float w){
float sum= (x+y+z+w);
    System.out.println("the total sumation: " +sum);

}
    public static void main(String[] args) {
        homework2 c = new homework2();
        // System.out.println("please input  a num");

        Scanner sc = new Scanner(System.in);
        System.out.println("please input  a num for add:");
        int f = sc.nextInt();
        //System.out.println("your input num is: " +f);

        System.out.println("please input another  a num for add:");
        int h = sc.nextInt();
        //System.out.println("your input another num is: " +h);
        int k = c.add(f, h);


        System.out.println("please input  a num for sub:");
        int z = sc.nextInt();
        //System.out.println("your input num is: " +f);

        System.out.println("please input another  a num for sub:");
        int v = sc.nextInt();
        //System.out.println("your input another num is: " +h);
        int g = c.sub(z, v);


        System.out.println("please input  a num for mul:");
        int n = sc.nextInt();
        //System.out.println("your input num is: " +f);

        System.out.println("please input another  a num for mul:");
        int m = sc.nextInt();
        //System.out.println("your input another num is: " +h);
        int l = c.mul(n, m);


        System.out.println("please input  a num for div:");
        int p = sc.nextInt();
        //System.out.println("your input num is: " +f);

        System.out.println("please input another  a num for div:");
        int q = sc.nextInt();
        //System.out.println("your input another num is: " +h);
        float e = c.div(p,q);

        c.addd(k, g, l, e);


    }
}

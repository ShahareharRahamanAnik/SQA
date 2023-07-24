package homwork6;

import java.io.IOException;
import java.util.Scanner;

public class homwork6 {

   // private static Scanner scanner;

    public int add(int x, int y){
        int sum = x+y;
        System.out.println("the sum is :" +sum);
        return(sum);
    }
/*
    public void test4(String g){
        //System.out.println(g+ " " + h);
        String s = g;
    }
*/
    public static void main(String[] args) throws IOException {
        homwork6 c = new homwork6();
        // System.out.println("please input  a num");

        Scanner scanner = new Scanner(System.in);
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please input  a num:");
        int f = scanner.nextInt();
        //System.out.println("your input num is: " +f);

        System.out.println("please input another  a num:");
        int h = scanner.nextInt();
        //System.out.println("your input another num is: " +h);
        int k = c.add(f, h);
/*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a line of text: ");
        String line = bufferedReader.readLine();
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        String line = sc.nextLine();

        System.out.println( line+" "+k);
    }
}

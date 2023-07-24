
package homwork6;

import java.io.IOException;
import java.util.Scanner;

public class homwork6 {
    public homwork6() {
    }

    public int add(int x, int y) {
        int sum = x + y;
        System.out.println("the sum is :" + sum);
        return sum;
    }

    public static void main(String[] args) throws IOException {
        homwork6 c = new homwork6();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input  a num:");
        int f = scanner.nextInt();
        System.out.println("please input another  a num:");
        int h = scanner.nextInt();
        int k = c.add(f, h);
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        scanner.nextLine();
        String line = scanner.nextLine();
        System.out.println(line + " " + k);
    }
}

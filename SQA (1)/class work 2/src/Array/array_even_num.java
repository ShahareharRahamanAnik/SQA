package Array;

import java.util.Scanner;

public class array_even_num {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the value for even numbers:");
        n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {

            array[i] = i*2;
        }
        System.out.println("The array elements are:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}

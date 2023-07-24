package Array;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
            System.out.println("input the value:");
            n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value for element " + i + ": ");
            array[i] = sc.nextInt();
        }

        // Print the array elements

        System.out.println("The array elements are:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}


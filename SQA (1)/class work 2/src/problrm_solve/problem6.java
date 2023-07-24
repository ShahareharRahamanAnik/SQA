package problrm_solve;

import java.util.Arrays;
import java.util.Scanner;

public class problem6 {

    public static void array(int[] array) {
        System.out.println("the array is : " + Arrays.toString(array));
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("The largest number is:" + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the range for array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("the values for array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        array(array);
    }
}

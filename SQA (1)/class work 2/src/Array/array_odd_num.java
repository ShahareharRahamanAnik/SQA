package Array;////import java.util.Arrays;
////import java.util.Scanner;
////
////import static java.lang.System.*;
////
////public class array_odd_num {
////
////
////        public static void main(String[] args) {
////            // Create a Scanner object to read user input
////            Scanner scanner = new Scanner(in);
////
////            // Get the limit of the odd series
////            System.out.print("Enter the limit of the odd series: ");
////            int limit = scanner.nextInt();
////
////            // Create an array to store the odd numbers
////            int[] oddNumbersArray = new int[limit];
////
////            // Iterate through the array and add odd numbers to it
////            for (int i = 1; i < limit; i++) {
////                if (i % 2 != 0) {
////                    oddNumbersArray[i - 1] = i;
////                }
////            }
////            //System.out.println(Arrays.toString(oddNumbersArray));
////
////            // Print the odd numbers
////            System.out.println("The odd numbers are:");
////            for (int oddNumber : oddNumbersArray) {
////                if (oddNumber > 0) {
////                    System.out.print(oddNumber + " ");
////                    }
//////                int[] array = new int[limit/2];
//////                for (int i = 1; i < limit/2; i++) {
//////                    array[i] = oddNumber;
////                }
//////                System.out.println(Arrays.toString(array));
////                }
////
////            }
////        }
////
//import java.util.Arrays;
//import java.util.Scanner;
//
//import static java.lang.System.*;
//
//public class array_odd_num {
//
//
//    public static void main(String[] args) {
//        // Create a Scanner object to read user input
//        Scanner scanner = new Scanner(in);
//
//        // Get the limit of the odd series
//        System.out.print("Enter the limit of the odd series: ");
//        int limit = scanner.nextInt();
//
//        // Create an array to store the odd numbers
//        int[] oddNumbersArray = new int[limit];
//
//        // Iterate through the array and add odd numbers to it
//        for (int i = 1; i < limit; i++) {
//            if (i % 2 != 0) {
//                oddNumbersArray[i - 1] = i;
//            }
//        }
//
//        // Print the odd numbers
//        System.out.println("The odd numbers are:");
//        for (int oddNumber : oddNumbersArray) {
//            if (oddNumber > 0) {
//       int oddnum = oddNumber;
//                System.out.print(oddnum + " ");
//            }
//        }
//
//        // Create a new array to store the values from oddNumbersArray
//        int[] array = new int[oddNumbersArray.length];
//
//        // Copy the values from oddNumbersArray to array
//        for (int i = 0; i < oddNumbersArray.length; i++) {
//            array[i] = oddnum[i];
//        }
//
//        // Print the values from array
//        System.out.println("\nThe values from oddNumbersArray are:");
//        for (int value : array) {
//            System.out.print(value + " ");
//        }
//    }
//}

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class array_odd_num {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        for(  ;  ; ) {
            System.out.print("\n Enter the limit of the odd series: ");
            int limit = scanner.nextInt();
            int[] oddNumbersArray = new int[limit];
            for (int i = 1; i <= limit; i++) {
                if (i % 2 != 0) {
                    oddNumbersArray[i - 1] = i;
                }
            }
            System.out.println("The odd numbers are:");
            for (int oddNumber : oddNumbersArray) {
                if (oddNumber != 0) {
                    System.out.print(oddNumber + " ");
                }
            }
            int[] array = new int[oddNumbersArray.length / 2];
            int j = 0;
            int k = oddNumbersArray.length / 2;
            System.out.println("the length :" + k);
            for (int i = 0; i <= k+1 ; i++) {
                if (oddNumbersArray[i] != 0) {
                    array[j] = oddNumbersArray[i];
                    j++;
                }
            }
            System.out.println("the array is:" + "\n" + Arrays.toString(array));
            // Print the values from array
            System.out.println("\nThe values from oddNumbersArray are:");
            for (int value : array) {
                System.out.print(value + " ");
            }
        }
    }
}

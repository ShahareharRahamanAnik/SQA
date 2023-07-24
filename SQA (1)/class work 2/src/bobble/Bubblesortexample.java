package bobble;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesortexample {
    public int[] bubbleSort(int[] ary){ //unorganised array is being organised
        int n = ary.length;
        int temp = 0;
        for (int i = 0; i < n; i++){
            for (int j = 1; j < (n - i); j++){
                if (ary[j - 1] > ary[j]){
                    temp = ary[j];
                    ary[j] = ary[j - 1];
                    ary[j - 1] = temp;
                }
            }
        }

        System.out.println("The rearranged array is: " + Arrays.toString(ary));
        return ary;
    }
    public int[] bubbleultraSort(int[] ary){ //finfing out double value from the organised array
        int m = ary.length;
        int j = 1;
        int[] ar = new int[m];
        for (int i = 1; i<=m && j<=m ;i++) {
            boolean ifequal = (j<m && ary[j - 1] == ary[j]) ;
            if (ifequal) {
                i--;
            }
            else {
                ar[i-1]=ary[j-1]; // removing the double value from the array
            }
            j++;
        }  // now array is complete without double value and have some 0 in the last
        int p = 0;
        int k = ar.length;
        for (int i = 1; i<k;i++){ //finding out the number of zeros
            if ( ary[i-1] == ary[i]){
                p++; // store here the total zeros
            }
        }
        int h = ar.length-p;
        int[] array = new int[h];
        for(int i =0; i<=h; i++ ){
            if(ar[i] != 0){
                array[i]=ar[i];  // removing the 0 and a new array is making without zero
            }
        }
        return array;       // final array which is organised and without any zeros
        }
    public static void main(String[] args) {
        Bubblesortexample bb = new Bubblesortexample();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the range of your array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int x = 0; x < n; x++){
            System.out.println("Input the value for " + (x+1) + ":");
            int p = sc.nextInt();
            array[x] = p;
        }
        System.out.println("The array is: " + Arrays.toString(array));
        int[] a =  bb.bubbleSort(array);
        int [] b=bb.bubbleultraSort(a);
        System.out.println("The final array is: " + Arrays.toString(b));
    }
}

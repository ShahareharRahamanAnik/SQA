import java.util.Arrays;
import java.util.Scanner;

public class oddevencount {

        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("input the value:");
            n = sc.nextInt();
            int k=0;
            int l=0;
           int  sumod= 0;
            int sumev = 0;
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the value for element " + i + ": ");
                array[i] = sc.nextInt();
                int h = array[i];
                if(h%2==0){
                   sumev = h+sumev;
                    k++;
                } else  {
                    sumod = h+sumod;
                    l++;
                }
            }
            System.out.println("the array is :" + Arrays.toString(array));
            System.out.println("total odd numbers:" + l );
            System.out.println("total odd sum numbers:" + sumev );
            System.out.println("total even numbers:" + k );
            System.out.println("total even sum numbers:" + sumod );
    }

}

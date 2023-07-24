import java.util.Arrays;
import java.util.Scanner;

public class evenoddcountformserise {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the value:");
        n = sc.nextInt();
        int k=0;
        int l=0;
       // sum=0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            //System.out.println("Enter the value for element " + i + ": ");
            array[i] = i;
            if(i%2==0){
                 k++;
            } else  {
                l++;
            }
        }
        System.out.println("the array is :" + Arrays.toString(array));
        System.out.println("total even numbers:" + k );
        System.out.println("total odd numbers:" + l );
    }



}

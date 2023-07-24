
public class Main {
/*
    int x = 4;
    float y = 5.23f;
    float z = 10.74f;
*/
    public Main (int x, int y, int z) {
        System.out.println(" value of x: " + x);
        System.out.println(" value of y: " + y);
        System.out.println(" value of z: " + z);
        float summation = x + y + z;
        System.out.println(" value of summation is: " + summation);
        float subtract =  z -x - y;
        System.out.println(" value of subtraction is: " + subtract);
        float multiplication = x * y * z;
        System.out.println(" value of multiplication is: " + multiplication);
        float division = z / y / x ;
        System.out.println(" value of division is: " + division);
    }

    public static void main(String[] args) {

        Main anything = new Main(5 , 7, 8);

    }
}
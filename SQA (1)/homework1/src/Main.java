
public class Main {

    int x = 4;
    float y = 5.23f;
    float z = 10.74f;
    public void value () {

        System.out.println(" value of x: " + x);
        System.out.println(" value of y: " + y);
        System.out.println(" value of z: " + z);
    }
    public void sum () {

            float summation = x + y + z;
        System.out.println(" value of summation is: " + summation);
    }
    public void sub () {

            float subtract =  z -x - y;
        System.out.println(" value of subtraction is: " + subtract);
    }
    public void mul () {

            float multiplication = x * y * z;
        System.out.println(" value of multiplication is: " + multiplication);
    }
    public void div () {

            float division = z / y / x ;
        System.out.println(" value of division is: " + division);
    }
    public void function () {
        div();



    }

    public static void main(String[] args) {

        Main anything = new Main();
        anything.value();
        anything.sum();
        anything.sub();
        anything.mul();
        anything.div();
        anything.function();
    }
}
import java.util.Scanner;

public class student  extends govt{
    public static void main(String[] args) {
        student st = new student();
        Scanner sc = new Scanner(System.in);
        for ( ; ; ) {
            int x = sc.nextInt();
            st.school(x);
        }
    }
}

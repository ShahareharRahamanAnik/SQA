import java.util.Scanner;

public class booleanz {
    public void  school(int x){
        boolean presence = (x != 1);
        if (presence){
            System.out.println("he is absent");
        }
        else {
            System.out.println("he is present");
        }
    }

    public static void main(String[] args) {
        booleanz sc = new booleanz();
        Scanner s = new Scanner(System.in);
        for ( ; ;){
        int x = s.nextInt();
        sc.school(x);
    }
    }

}

import java.util.Scanner;

public class leapyear {
    public void leap( int year){
        boolean isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        if (isLeapYear) {
            System.out.println("The year is a leap year.");
        }
        else {
            System.out.println("The year is not a leap year.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //input object call
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        leapyear ly = new leapyear(); //object creat
        ly.leap(year);// function call
    }
}


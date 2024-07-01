import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner yr = new Scanner(System.in);
        System.out.println("Enter Year:");
        int year = yr.nextInt();
        if (year < 1000 || year > 9999){
            System.out.println("Enter in 4 digits.");
        } else {
            if (year%4 == 0){
                System.out.println(year +" is a leap year.");
            } else {
                System.out.println(year +" is not a leap year.");
            }
        }
    }
}

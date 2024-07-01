import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter numerator and denominator:");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = a/b;
        int d = a%b;
        System.out.println("Quotient: "+ c);
        System.out.println("Remainder: "+ d);
    }
}

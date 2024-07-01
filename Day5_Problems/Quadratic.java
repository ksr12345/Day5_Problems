import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        System.out.println("Equation is: "+ a +"X*X + "+ b +"X + " + c);

        int d = b*b + 4*a*c;
        float x = (float) (-b + Math.sqrt(d))/(2*a);
        float y = (float) (-b - Math.sqrt(d))/(2*a);

        System.out.println("Roots are: "+ x +" and "+ y);
    }
}

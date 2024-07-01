import java.util.Scanner;

public class HarmonicNo {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = num.nextInt();
        double sum = 0.0;
        for (int i = 1; i< a+1; i++){
            sum += (double) 1 /i;
        }
        System.out.println("Harmonic Number is: "+ sum);
    }
}

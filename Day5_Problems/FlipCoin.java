import java.util.*;

public class FlipCoin {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("The number of times to Flip Coin: ");
        int a = num.nextInt();
        if (a <= 0){
            System.out.println("Enter a positive Integer.");
        } else {
            int heads = 0;
            int tails = 0;
            Random x = new Random();
            for (int i = 0; i<a ; i++){
                double b = x.nextDouble();
                if (b < 0.5){
                    tails++;
                } else {
                    heads++;
                }
            }
            double headpercentage = (double) heads/a * 100;
            double tailpercentage = (double) tails/a * 100;

            System.out.println("Percentage of Head: "+ headpercentage);
            System.out.println("Percentage of Tails: "+ tailpercentage);
        }

    }
}

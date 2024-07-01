import java.util.Scanner;

public class LargestAmong3 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        if (a>b){
            if (a>c){
                System.out.println(a +" is greatest");
            } else {
                System.out.println(c +"is greatest");
            }
        } else {
            if (b>c){
                System.out.println(b +" is greatest");
            } else {
                System.out.println(c +" is greatest");
            }
        }
    }
}

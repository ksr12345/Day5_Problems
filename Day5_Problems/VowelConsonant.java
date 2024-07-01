import java.util.Scanner;

public class VowelConsonant {
    public  static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a alphabet: ");
        String a = num.nextLine();

        switch (a){
            case "a":
                System.out.println("It is a vowel");
                break;
            case "e":
                System.out.println("It is a vowel");
                break;
            case "i":
                System.out.println("It is a vowel");
                break;
            case "o":
                System.out.println("It is a vowel");
                break;
            case "u":
                System.out.println("It is a vowel");
                break;
            case "A":
                System.out.println("It is a vowel");
                break;
            case "E":
                System.out.println("It is a vowel");
                break;
            case "I":
                System.out.println("It is a vowel");
                break;
            case "O":
                System.out.println("It is a vowel");
                break;
            case "U":
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is a consonant");
        }
    }
}


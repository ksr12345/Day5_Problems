public class Powerof2 {
    public static void main(String[] args){
        if (args.length != 1){
            System.out.println("Enter only one positive integer");
        }
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n+1 ; i++){
            System.out.println(Math.pow(2,i));
        }
    }
}

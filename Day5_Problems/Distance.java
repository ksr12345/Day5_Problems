public class Distance {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Enter 2 values only");
            return;
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Euclidean distance from ("+ x + ", "+ y + ") to (0, 0) is: " + distance);
    }
}

import java.util.Scanner;

public class SaravananP8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String bin = in.next();
        System.out.println("Decimal Number: " + Integer.parseInt(bin, 2));
    }
}

import java.util.Scanner;

public class SaravananP6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int dec = in.nextInt();
        System.out.println("Hexadecimal number is : " + Integer.toHexString(dec).toUpperCase());
    }
}

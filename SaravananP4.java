import java.util.Scanner;

public class SaravananP4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String bin1 = in.next();
        System.out.print("Input second binary number: ");
        String bin2 = in.next();
        
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int sum = num1 + num2;
        
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(sum));
    }
}

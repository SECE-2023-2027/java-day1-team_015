import java.util.Scanner;

public class SaravananP15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        System.out.print("Input the third number : ");
        int c = in.nextInt();
        
        boolean result = (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);
        System.out.println("The result is: " + result);
    }
}

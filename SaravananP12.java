import java.util.Scanner;

public class SaravananP12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a character: ");
        char ch = in.next().charAt(0);
        int ascii = ch;
        System.out.println("The ASCII value of " + ch + " is :" + ascii);
    }
}

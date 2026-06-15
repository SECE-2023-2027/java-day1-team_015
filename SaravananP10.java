import java.util.Scanner;

public class SaravananP10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();
        
        StringBuilder reverse = new StringBuilder(str);
        System.out.println("Reverse string: " + reverse.reverse().toString());
    }
}

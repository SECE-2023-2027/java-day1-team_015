import java.util.Scanner;

public class SaravananP11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Prompt the user for input
        System.out.println("Input the string:");
        String str = in.nextLine();
        
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else if (Character.isSpaceChar(ch) || Character.isWhitespace(ch)) {
                spaces++;
            } else {
                others++;
            }
        }
        
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
    }
}

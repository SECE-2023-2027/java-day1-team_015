import java.util.*;
public class octal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans=Integer.toOctalString(n);
        System.out.println(ans);
    }
}

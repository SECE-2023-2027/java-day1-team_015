import java.util.*;
public class hexadecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans=Integer.toHexString(n).toUpperCase();
        System.out.println(ans);
    }
}

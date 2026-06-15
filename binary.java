import java.util.*;
public class binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int num1=Integer.parseInt(s1,2);
        int num2=Integer.parseInt(s2,2);
        int sum=num1+num2;
        String ans=Integer.toBinaryString(sum);
        System.err.println(ans);

    }
}

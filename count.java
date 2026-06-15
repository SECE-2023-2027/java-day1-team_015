import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int a=0,b=0,c=0,d=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch))   a++;
            else if(Character.isWhitespace(ch)) b++;
            else if(Character.isDigit(ch)) c++;
            else d++;
        }
        System.out.println("Letters: "+a);
        System.out.println("Space: "+b);
        System.out.println("Number: "+c);
        System.out.println("Other: "+d);
    }
        
}

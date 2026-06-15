import java.util.*;
public class circle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rad=sc.nextInt();
        System.out.println("Area: "+Math.PI*rad*rad);
        System.out.println("Perimeter: "+2*Math.PI*rad);
    }
}

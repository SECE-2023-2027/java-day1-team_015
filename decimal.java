import java.util.*;
public class decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        String ans="";
        for(int i=31;i>=0;i--){
            if((n & (1<<i)) !=0 ){
                ans+='1';
                flag=true;
            }
            else if(flag){
                ans+='0';
            }
        }
        System.out.println(ans);
    }
}

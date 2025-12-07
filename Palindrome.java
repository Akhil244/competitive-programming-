import java.util.*;
public class Palindrome{

    private static String palindrome(int n){
        int t=n,rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        boolean ok=(t==rev);
        if(ok){
            return "Palindrome";
        }
        return "not palindrome";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res=palindrome(n);
        System.out.println(res);
    }
}
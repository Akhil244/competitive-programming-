import java.util.*;
public class Reverse{

    private static int reverse(int n){
        int rev=0,r=0;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n/=10; 
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=reverse(n);
        System.out.println(val);
    }
}
import java.util.*;
public class Countingdigit{
    
    private static int logcount(int n){
        int res=(int)Math.log10(n)+1;
        return res;
    }
    private static int counting(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=counting(n);
        System.out.println(c);
        int log=logcount(n);
        System.out.println(log);
    }
}
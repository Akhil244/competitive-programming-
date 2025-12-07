import java.util.*;
public class Armstrong{

    private static String armstrong(int n){
        int sum=0,t=n;
        while(n>0){
            int r=n%10;
            sum+=r*r*r;
            n/=10;
        }
        boolean res=(t==sum);
        if(res){
            return "Armstrong";
        }
        return "Not Armstrong";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res=armstrong(n);
        System.out.println(res);
    }
}
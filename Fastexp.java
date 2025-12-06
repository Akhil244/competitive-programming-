import java.util.*;
public class Fastexp{

    public static int fastexpo(int n,int power){
        int res=1;
        while(power>0){
            if(power%2!=0){
                res*=n;
            }
            power/=2;
            n*=n;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pow=sc.nextInt();
        int res=fastexpo(n,pow);
        System.out.println(res);
    }
}
import java.util.*;
public class Fact{
    
    // counts the no of zeros in the factorial
    //// eg: 5! = 5x4x3x2x1 = 120 no of trailing zeros are 0
    public static int trailing(int n){
        int res=0;
        for(int i=5;i<=n;i*=i){
            res+=n/i;
        }
        return res;
    }
    // prints the factorial of the no
    // eg: 5! = 5x4x3x2x1 = 120
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=fact(n);
        System.out.println(f);
        int t=trailing(n);
        System.out.println(t);
    }
}
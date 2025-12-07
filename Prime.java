import java.util.*;
public class Prime{

    private static String print(int n){
        int sq=(int)Math.sqrt(n),c=2;
        while(c<=sq){
            if(n%c==0){
               return "not prime";
            }
            c++;
        }
        return "prime";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res=print(n);
        System.out.println(res);
    }
}
import java.util.*;
public class Divisor{
    
    //prints the no of factors present for a particular no
    private static void printdivisor(int n){
        int sqrt=(int)Math.sqrt(n),c=1;
        while(c<=sqrt){
            if(n%c==0){
                int ot=n/c;
                System.out.println(c);
                if(ot!=c){
                    System.out.println(ot);
                }
            }
            c++;
        }
    }

    //returns the count of the no of factors for a particular no handling the edge cases as well
    private static int count(int n){
        int sqrt=(int)Math.sqrt(n),c=1,res=0;
        while(c<=sqrt){
            if(n%c==0){
                res++;
                int ot=n/c;
                System.out.println(c);
                if(ot!=c){
                    System.out.println(ot);
                    res++;
                }
            }
            c++;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printdivisor(n);
        int c=count(n);
        System.out.println(c);
    }
}
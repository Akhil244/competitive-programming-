import java.util.*;
public class LcmGcd{

    public static int lcm(int a,int b){
        int lcm=(a*b)/optimal(a,b);
        return lcm;
    }
    public static int optimal(int a,int b){

        // here we directly return the answer by doing % everytime
        while(a!=0 && b!=0){
            if(a>b){
              a%=b;
           }
            else{
                b%=a;
            }
        }
        int res=a;
        if(a==0){
            res=b;
        }
        return res;
    }
    public static int euc(int a,int b){
        // here we subtract the bigger with smaller no until one of the no becomes 0
        while(a!=0 && b!=0){
            if(a>b){
              a-=b;
           }
            else{
              b-=a;
            }
        }
        int res=a;
        if(a==0){
            res=b;
        }
        return res;
    }
    public static int gcd(int a,int b){
    
    // first we check if the nos are xeros if so then we return the other no
    // after the above check we take the minimum no out of 2 and then we calculate the factors 
    // in the minimum no there are less no of factors which might not be factor for the other no
    // whereas in the bigger no there are more factors which are not divisible to the other no
    // choose always the minimum no first and calculate the max factor for it and check whether its divisible to other or not

            int max=0;
            if(a==0){
                return b;
            }
            if(b==0){
                return a;
            }
            else{
                if(a<b){   
                    for(int i=1;i<=a;i++){      
                        if(a%i==0 && b%i==0){
                            max=i;
                        }
                    }
                }
                else{
                    for(int i=1;i<=b;i++){      
                        if(a%i==0 && b%i==0){
                            max=i;
                        }
                    }   
                }
            }
            return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int res=gcd(a,b);
        System.out.println(res);
        int e=euc(a,b);
        System.out.println(e);
        int opt=optimal(a,b);
        System.out.println(opt);
        int lcm_r=lcm(a,b);
        System.out.println(lcm_r);
    }
}
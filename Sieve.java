import java.util.*;
public class Sieve{

    private static void sieve(int n){

        // in this approach lets assume our n as 10
        // in this approach we are suing a boolean array to remove all the composite no or >2 divisors
        // we define a boolean array which contains nos from 0 to 10 based and remove the first 2 values 0,1
        // start from 2 to the very end that is 10

        boolean a[]=new boolean[n+1];
        Arrays.fill(a,true);
        int c=2;
        while(c<=n){
            if(a[c]==true){
                for(int f=c+c;f<=n;f+=c){   
                    a[f]=false;
                }
            }
            c++;
        }

        // we are printing the pair values with T/F that is if prime then its true else false
        for(int i=2;i<=n;i++){
            System.out.println(i+":"+a[i]);
        }
    }

    private static int countsieve(int n){
        boolean a[]=new boolean[n+1];
        Arrays.fill(a,true);
        int c=2;
        while(c<=n){
            if(a[c]==true){

                // this is the working of the for loop and the sieve algorithm's core
                // we remove the values 0 and 1 and start our comparision with 2
                // we first initialize the value of f by adding 2 + 2 
    // for eg in the first iteration the value of c=2 and the value of f=4 => position 4(number:4) is marked as false
                // similarly 6,8,10,... the nos with difference of 2 are marked as false
                // similarly for c=3 the nos with difference of 3 are marked as false 
                // for c=4 the difference of 4 are makrked as false
                // this continues till the value n is reached 
                // finally the nos which arr marked as false are counted and they are returned by this function

                // note that the init is done only once
                // rest of the time we check cond then excecute loop and then update the inc/dec condn
                
                for(int f=c+c;f<=n;f+=c){  
                    a[f]=false;
                }
            }
            c++;
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(a[i]==true){
                count++;
            }
        }
      return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sieve(n);
        int res=countsieve(n);
        System.out.println(res);
    }
}
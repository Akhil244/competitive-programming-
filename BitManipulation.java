import java.util.*;
public class BitManipulation{

    // use left shift to check bitset
    private static String bitset(int n,int i){
        if((n&(1<<i))!=0){
            return "set";
        }
        return "not set";
    }

    //check whether a no is even or odd(we use left shift)
    private static String evenodd(int n){
        if((n&(1<<0))==0){
            return "even";
        }
        return "odd";
    }

    // use right shift to print bits
    private static String printbits(int n){
        String res="";
        // for(int i=0;i<3;i++) prints it in right to left fashion (LSB to MSB)
        for(int i=n;i>=0;i--){   // prints it in correct order that is (MSB to LSB)
           res+=((n>>i)&1);
        }
        return res;
    }
    
    // we are trying to set the ith bit pos
    private static int set(int n,int i){
        n=(n|(1<<i));
        return n;
    }

    private static int toggle(int n,int i){
        // we are changing the value of bit eg: if bit is '1' then toggle to '0'
        // here we are using bitwise XOR which changes the value at bit level 
        // eg: if a is '1' and b is '1' then toggles it to '0' and vice versa
        int to=(n^(1<<i));
        return to;
    }
    private static void unset(int n,int i){
        // we are changing the set bit that is '1' to '0' at ith pos
        // if theres '0' its not set so remains unchanged
        // if bit is '1' then the value is unset to '0'
        System.out.println(printbits(n));
        n=(n&~(1<<i));   
        System.out.println(printbits(n));
    }

    private static String power(int n){
        if((n&(n-1))==0){
            return "power of 2";
        }
        return "not power of 2";
    }

    // the property n&(n-1) unsets right most set bits (LSB) 
    private static int unsetright(int n){
        return n&(n-1);
    }

    private static int countset(int n){
        int count=0;
        // we unset as many 1's as possible=> no of setbit count is same as no of times set bit is removed
        // take n=5 => turns the right most bits to 0
        // 5&4 => 101&100 => 100 , count=1
        // 4&3=>  100&011 => 000 , count=2
        // 0 => condition is failed => exit the loop
        // returns the count
        while(n!=0){
            n=unsetright(n);
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=sc.nextInt();
        String s=bitset(n,i);
        System.out.println(s);
        String r=evenodd(n);
        System.out.println(r);
        String p=printbits(n);
        System.out.println(p);
        int set=set(n,i);
        System.out.println(set);
        int t=toggle(n,i);
        System.out.println(t);
        unset(n,i);
        String s1=power(n);
        System.out.println(s1);
        int co=countset(n);
        System.out.println(co);
    }
}
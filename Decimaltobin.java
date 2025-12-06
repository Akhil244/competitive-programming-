import java.io.*;
import java.util.*;
public class Decimaltobin{

    private static int binarytodec(int bin){
        int res=0,pow=0;
        while(bin>0){
            int r=bin%10;
            bin/=10;
            res+=r*Math.pow(2,pow);
            pow++;
        }
        return res;
    }

    private static int convtoanybase(int n,int b){
        // this is the code to convert any given no to any base
        int res=0,pow=0;
        while(n>0){
            int r=n%b;
            n/=b;
            res+=r*Math.pow(10,pow);
            pow++;
        }
        return res;
    }

    private static int conversiontodecimal(int n){
        // this is the code to convert any given no to base 2
        int res=0,pow=0;
        while(n>0){
            int r=n%2;
            n/=2;
            res+=r*Math.pow(10,pow);
            pow++;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=conversiontodecimal(n);
        System.out.println(res);
        int num=sc.nextInt();
        int b=sc.nextInt();
        int tot=convtoanybase(num,b);
        System.out.println(tot);
        int num3=sc.nextInt();
        int dec=binarytodec(num3);
        System.out.println(dec);
        
    }
}
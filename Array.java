import java.util.*;
public class Array{

    // inserting elements at a particular pos in an array
    private static void inspos(int a[],int pos,int val){
        int n=a.length;
        // shifting towards the end of the array
        // start from n-2 till pos is reached perform shifting RHS
        for(int i=n-2;i>=pos;i--){  
            a[i+1]=a[i];
        }
        a[pos]=val;
    }

    private static void deletepos(int a[],int pos){
        int n=a.length;
        for(int i=pos;i<=n-2;i++){
            a[i]=a[i+1];
        }
        a[n-1]=0;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];  // the way of creating an array 
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();   
        }
        int val=sc.nextInt(),pos=sc.nextInt();
        inspos(a,pos,val);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
        int s=sc.nextInt();
        int b[]=new int[s];
        int pos2=sc.nextInt();
        for(int i=0;i<s;i++){
            b[i]=sc.nextInt();   
        }
        deletepos(b,pos2);
        for(int i=0;i<s;i++){
            System.out.print(b[i]+" ");
        }
    }
}
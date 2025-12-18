import java.util.*;
public class BinarySearch{
    
    public static int bsearch(int a[],int val,boolean ok){
        int l=0,h=a.length-1,ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]==val){
               ans=m;
               if(ok){
                  h=m-1; // since the array is sorted in ascending order we are checking the LHS whether theres element or not

               }
               else{
                  l=m+1;
               }
            }
            else if(a[m]<val){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return ans;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        boolean ok=true;

        int res=bsearch(a,val,ok);

        // if we want to see the last occurence we change ok to false
        System.out.println(res);
        
    }
}
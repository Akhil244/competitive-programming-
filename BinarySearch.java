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
                  l=m+1; // will go to the RHS
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
   
    
    // we are finding the closest RHS value to the target 
    private static int binaryfloor(int a[],int t){
        int l=0,h=a.length-1,ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]==t){
                ans=a[m];
            }
            else if(a[m]<t){
                ans=a[m];
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return ans;
    }
    
    // here in ceil we are finding the closest LHS value to the target
    private static int binaryceil(int a[],int t){
        int l=0,h=a.length-1,ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]==t){
                ans=a[m];
            }
            else if(a[m]>t){
                ans=a[m];
                h=m-1; 
            }
            else{
                l=m+1;
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
        // boolean ok=true;

        // int first=bsearch(a,val,ok);
        // System.out.println(first);
        // // if we want to see the last occurence we change ok to false to get the last occurence 
        // int last=bsearch(a,val,false);
        // System.out.println(last);
        // int range=last-first+1;
        // System.out.println(range); 

        // int fl=binaryfloor(a,val);
        // int ce=binaryceil(a,val);
        // System.out.println(fl);
        // System.out.println(ce);
        
        int abs=absdifference(a,val);
        System.out.println(abs);
    }
}
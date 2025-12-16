import java.util.*;
public class Searching{
    
    private static int linearsearch(int a[],int val){
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==val){
                return i;
            }
        }
        return -1;
    }

    private static void multiple(int a[],int val){
        int n=a.length,k=0;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(a[i]==val){
                ans[k]=i;
                k++;
            }
        }

        for(int i=0;i<k;i++){
            System.out.println(ans[i]+" ");   // printing elements till k
        }
        
    }

    private static int max(int a[]){
        int max=Integer.MIN_VALUE;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }

    private static int min(int a[]){
        int min=Integer.MAX_VALUE;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }

    // performing linear search to finfd the max subarray in 2d array using linear search
    private static int maxsubarray(int arr[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=0;j<arr[i].length;j++){
                    s+=arr[i][j];
            }
            if(s>max){
                max=s;
            }
        }
        return max;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int v=sc.nextInt();
        int pos=linearsearch(a,v);
        System.out.println(pos);
        
        int val=sc.nextInt();
        multiple(a,val);
        int mi=min(a);
        int ma=max(a);
        System.out.println(mi);
        System.out.println(ma);

        int M=sc.nextInt(),N=sc.nextInt();
        int arr[][]=new int[M][N];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int res=maxsubarray(arr);
        System.out.println(res);
    }
}
import java.util.*;
public class MultidimArray{

    // we are going to reuse the codes that we written for 1D array:

    // inserting elements at a particular pos in a 1D array
    private static void inspos(int a[],int pos,int val){
        int n=a.length;
        // shifting towards the end of the array
        // start from n-2 till pos is reached perform shifting RHS
        for(int i=n-2;i>=pos;i--){  
            a[i+1]=a[i];
        }
        a[pos]=val;
    }
    
    // deleting an element at particular pos in 1D array
    private static void deletepos(int a[],int pos){
        int n=a.length;
        // we are shifting the elements toward RHS starting from the pos till n-2 and assigning last no with 0
        for(int i=pos;i<=n-2;i++){
            a[i]=a[i+1];
        }
        a[n-1]=0;
    }

    private static void print2d(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void insert2d(int a[][],int pos1,int pos2,int ele){
        inspos(a[pos1],pos2,ele); // reusing the code we written for 1D array
    }

    
    private static void delete2d(int a[][],int pos3,int pos4){
        deletepos(a[pos3],pos4); // reusing the code we written for 1D array 
    }

    
    public static void main(String args[]){
        // creating a 2D array as example
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        int [][]a=new int[m][n]; // example where we created a 2D array for mxn size
        // reading a 2D array
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        print2d(a);
        // calling the insert and delete for 2D array
        int i1=sc.nextInt(),i2=sc.nextInt(),val=sc.nextInt();
        insert2d(a,i1,i2,val);
        print2d(a);
        delete2d(a,i1,i2);
        print2d(a);
        int csize=sc.nextInt();
        jagged(m,csize);
        print2d(a);
    }
}
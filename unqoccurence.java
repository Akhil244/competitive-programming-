import java.util.*;
public class unqoccurence{
   
    // this code only prints unique occurence of element in an array 
    // ex: 1 2 2 4 6 4 6  it should out: 1
    private static int unqoccur(int a[],int n){
        int x=0;
        n=a.length;
        for(int i=0;i<n;i++){
            x^=a[i];
        }
        return x; 
    }

    // this is the follow up code for the problem that is if the no of occurences is more than 1 
    // eg: 2 6 2 4 3 3 1 1 then out: 6 4 
    // we first perform xor operation we get 6^4 that is 2
    // we divide the array into seperate groups that is 1st pos bit is set and other grp is not set
    // we are checking for first group of nos which has bit as set at 1st pos by performing xor with 2  
    // if we consider the prev eg: => we get 2^6=4
    // similarly again perfrom xor of 2 with the other group we 2^4=6 
    // finally print the result of both groups => out: 4 6

        private static void unqpair(int arr[]) {

                int l = arr.length;
                int res = 0;

                // XOR of all numbers
                for (int i = 0; i < l; i++) {
                    res ^= arr[i];
                }

                int setBit = 0;
                int bit = 0;

                // find rightmost set bit
                while (true) {
                    if (((res >> bit) & 1) != 0) {
                        setBit = bit;
                        break;
                    }
                    bit++;
                }

                int res1 = 0;

                // separate into two groups based on setBit
                for (int i = 0; i < l; i++) {
                    if (((arr[i] >> setBit) & 1) != 0) {
                        res1 ^= arr[i];
                    }
                }

                int num1 = res1;
                int num2 = res ^ res1;

                System.out.println("Num1: " + num1 + ", Num2: " + num2);
        }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // the way of creating a new Array
        int []a=new int[n]; // creating an array of size n (0 to n-1)

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(unqoccur(a,n));
        int s = sc.nextInt();           // number of elements
        int[] arr = new int[s];

        for (int i = 0; i < n; i++) {    // read n numbers correctly
            arr[i] = sc.nextInt();
        }

        unqpair(arr);
        
    }
}
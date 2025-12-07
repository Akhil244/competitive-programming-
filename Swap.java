import java.util.*;

// we are creating a new class here to store 2 variable which we can use it for call by reference
class Temp{
    int a,b;
}
public class Swap{
    public void swapbyvalue(int a,int b){
        // this is the call by value method defn
        // logic to swap 2 nos
        // no matter what value you give or initialize they are just formal params
        // the values in this method doesnt affect the main method
        System.out.println(a+" "+b);
        int t=a;
        a=b;
        b=t;
        System.out.println(a+" "+b);
    }

    public void swapbyreference(Temp v1,Temp v2){
       // here in swap by reference we create the objects and try swapping the values using the objects
       // dont create fresh objects again since we passed the objects as args in method
       // eg: if we write v1=new Temp() the v1 will be created seperately in memory and asigned
       // the final value wont be reflected in the main method 

        System.out.println(v1.a+" "+v2.b);
        int t=v1.a;
        v1.a=v2.b;
        v2.b=t;
        System.out.println(v1.a+" "+v2.b);
        
    }
    
    //Important Interview q on how to swap without using third variable
    private static void swapimp(int a,int b){
        a = a + b; 
        b = a - b; 
        a = a - b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Swap sw=new Swap();
        int a=sc.nextInt();
        int b=sc.nextInt();
        // since the method is void we can directly call the defn method using the main obj without addn memory wastage
        // we are passing down the actual params/args for the method which follows call by value
        // the values will be created seperately and passed down to the method it doesnt modify the actual values
        sw.swapbyvalue(a,b);
        Temp v1=new Temp();
        Temp v2=new Temp();
        v1.a=a;
        v2.b=b;
        sw.swapbyreference(v1,v2);
        swapimp(a,b);
        System.out.print(a+" "+b);

    }
}
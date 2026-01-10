import java.util.*;
public class Strings{
    private static void characterArray(String s){
        char ch[]=s.toCharArray();
        // remember for character or any type of array length is treated as property so dont use ()
        for(int i=0;i<ch.length;i++){   
            System.out.print(ch[i]+" ");
        }
    }
    private static void StringMethods(String s,int i){
        String lower=s.toLowerCase();
        System.out.println(lower);
        String upper=s.toUpperCase();
        System.out.println(upper);
        char pos=s.charAt(i);
        System.out.println(pos);
        int char_pos=s.indexOf(pos);
        System.out.println(char_pos);
        int last_pos=s.lastIndexOf(pos);
        System.out.println(last_pos);
        int length=s.length();
        System.out.println(length);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();
        // int pos=sc.nextInt(); 
        // StringMethods(s,pos);
        // characterArray(s);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(s1.compareTo(s2));
        String ex="    akhil cp template    ";
        String trimed=ex.trim();
        System.out.println(trimed);

        // program to split the string into array of substrings based on the specified re
        // splits the entire string into substrings based on the ','

        String mylocations="pune,hyderabad,bangalore,chennai";
        String myloc[]=mylocations.split(","); 
        for(int i=0;i<myloc.length;i++){
            System.out.print(myloc[i]+" ");
        }

        StringBuilder sb=new StringBuilder("venkata");
        sb.append("akhil");
        System.out.println(sb);
        
    }
}
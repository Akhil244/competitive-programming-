import java.util.*; //collections present inside this java.util package

public class Collections{

    
    //implemeting Arraylist using a sample example
    private static void Arraylistdemo(){

        //creating ArrayList using list interface
        List<Integer> l=new ArrayList<>();

        //adding elements using the builtin add method
        l.add(50);
        l.add(51);
        System.out.println(l);
        
        //indexing inside the arraylist using get method
        //used to get the values at a  paticular index

        System.out.println(l.get(1)); //gets value at index or position 1
        
        

    }



    public static void main(String args[]){

      Arraylistdemo();

    }
}
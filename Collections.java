import java.util.*; //collections present inside this java.util package

public class Collections{

  static class Student{
       String name;
       int rno;
       Student(String name,int rno){
          // initialize the details of the student that you will recieve
          this.name=name;
          this.rno=rno;   // stores the details passed by the user
       }
      
       // we can initialize the name and rno with the details using the parameterized constructor 
       //it is currently storing the address of the users input so this returns the address of the relevant fields

       //We override toString() because Java already provides a default implementation in the Object class. 
       // The default implementation prints the class name and hash code, which is usually not useful 
       // for our application. By overriding it, we provide our own meaningful representation of the object.
       
       public String toString(){
          return this.name+","+this.rno;
       } 
    }
    //implemeting Arraylist using a sample example
    private static void Arraylistdemo(){

        //creating ArrayList using list interface 
        // list also allows storng of duplicates

        List<Integer> l=new ArrayList<>();

        //adding elements using the builtin add method
        l.add(50);
        l.add(51);
        System.out.println(l);
        
        //indexing inside the arraylist using get method
        //used to get the values at a  paticular index

        System.out.println(l.get(1)); //gets value at index or position 1
        
        // to insert another element in the position where for example 51 is stored 

        // syntax : l.add(pos,ele_to_insert)
        
        l.add(1,10); // moves 51 forward and place 10 in the position where 51 is initially stored 

        System.out.println(l); // initial:[50,51] after this change:[50,10,51]

        // if we want to update the element at a particular index 

        // inital list (prev method): [50,10,51] assume we want to change 50 to 40 

        // l.set(pos,element_to_replace) will replace the element with the latest value

        l.set(0,40);

        System.out.println(l); // we will get the list as [40,10,51] after the update (50 is removed)

        // if we want to add a element at the first index we can use the method addFirst()

        l.addFirst(55); // will add the element 55 at first position that is 0-index 

        System.out.println(l); //now the updated list will be : [55,40,10,51]

        // since we are not updating we are just inserting no 40 will move RHS by one index
        
        // similarly it will move other elements too by one index

        //lets implement the method which involve defining our custom class

        // ex: i want to access certain details of student liks name and roll no:
        // we can create a list with class of type student and access the relevant student details

        // creating our list of type student 

        List<Student> val=new ArrayList<>();

        val.add(new Student("Akhil",55));

        val.add(new Student("Akash",50));

        System.out.println(val);

    }



    public static void main(String args[]){

      Arraylistdemo();

    }
}
import java.util.*; //collections present inside this java.util package

public class CollectionsFramework{

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

       // override the equals method of the Object class to compare the instances of the custom class

       public boolean equals(Object obj){

          if (obj instanceof Student s){
             return this.rno==s.rno && this.name.equals(s.name);
          }
          return false; 

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

        // ex: i want to access certain details of student like name and roll no:
        // we can create a list with class of type student and access the relevant student details

        // creating our list of type student 

        List<Student> val=new ArrayList<>();

        val.add(new Student("Akhil",55));

        val.add(new Student("Akash",50));

        System.out.println(val);

        // the other way of printing the elements inside the list 

        /*

        we traverse and print the elements using LIst Iterator 
        
        with in list iterator there are 2 methods:

        1. the method which keeps track of how many elements the list contain 
        mainly used to traverse the elements that is [hasNext() method]

        2. the method which prints the elements one after another
        [next() method ]

        */

     // printing the elements inside the list of class type student 

     // creating list iterator

     ListIterator<Student> tr= val.listIterator(); 

     // as you can see above we pass the object of the list which we created and has the elements stored on
     
     //printing the elements inside the list:

       while(tr.hasNext()){
          System.out.println("using list iterator:"+tr.next());
       }

       // if we want to traverse the list from right to left instead of the traditional left to right 
       /* 

       list iterator uses the methods:
       
       1. hasPrevious() method which keeps track of no of elements inside the list from right to left 

       2. previous() method which identifies the elements and prints them then moves ahead
       

       Note: without next and hasNext() method excecuted first we cannot directly use previous() methods

       because default the pointer is always placed at first ele of the list which makes the cond false
       
       if we want to traverse the lst using list iterators from right to left you need to right the logic of 

       left to right first then only we can make it right to left using the methods
       */

      while(tr.hasPrevious()){
         System.out.println("printing ele from right to left:"+tr.previous());
      } 
  
    // we can also traverse the list using advanced for each loop:

    /* syntax: 

        for(d_type or class_name obj_name:list_object_to_traverse){
           print(obj_name);
        }

        it traverses defualt from left to right

   */

      for(Student s: val){
         System.out.println("using for each loop"+s);
      }

      // removing the values inside the list of values that we wrote in arrayList
      l.remove(3); // this removes the value at index 3

      System.out.println(l);

      // if we want to remove the element instead of specifying index

      // since arraylist uses integer wrapper class we need to convert the value using valueOf() method

      l.remove(Integer.valueOf(10));

      System.out.println(l);
      

      // we can do the same for our custom class but we need to override the existing equals method 

      // same as toString() of the default class Object we need to do the same for equals()

      // removing the element that we aded to our custom class of type student

      val.remove(new Student("Akash",50));

      System.out.println(val);

      // to check the size of the list 

      System.out.println(l.size());
      
      // printing the elementrs using regular for loop

      for(int i=0;i<l.size();i++){
         System.out.println(l.get(i));
      }

      // sort the arraylist in increasing order can be done by using the built in method of collections class

      Collections.sort(l);

      for(int i=0;i<l.size();i++){
         System.out.println(l.get(i));
      }

    }



    public static void main(String args[]){

      Arraylistdemo();

    }
}
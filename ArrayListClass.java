// java collection interface 

//The Collection interface is the root interface of the collections framework.
//List is the subinterface .
//The List interface is an ordered collection that allows us to add 
//   and remove elements like an array.


package collectionstest;
import java.util.ArrayList;

public class ArrayListClass {

   public static void main(String[] args)
    {
        ArrayList<String> animals = new ArrayList<>();
        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        System.out.println("ArrayList: " + animals);
    }
}    


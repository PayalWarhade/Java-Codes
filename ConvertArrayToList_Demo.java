//Conversion of Array into List 


package collectionstest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConvertArrayToList_Demo {

    public static void main(String[] args) {
        String [] array = {"Jack","Leo","Lily","Ava"};
        System.out.println(Arrays.toString(array));
        
        List<String> list = new ArrayList <String>(); //function to convert an array to list 
        for(String name : array)
        {
        list.add(name);
        }
        Iterator<String> itr = list.iterator ();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    
    
}

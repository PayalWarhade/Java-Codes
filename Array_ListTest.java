//// java collection interface

//The List interface is an ordered collection that allows us to add 
//   and remove elements like an array.


package collectionstest;
import java.util.*;
public class Array_ListTest {
    public static void main(String[] args) {
        List<String>list = new ArrayList<String>();
        String str = "hi";
                list.add("string");
                list.add(str);
                list.add(str+str);
        System.out.println(list.size());
        System.out.println(list.contains(42));
        System.out.println(list.contains("hihi"));
        list.remove("hi");
        System.out.println(list.size());
        list.add("hi");
        list.add(str);
        System.out.println(list.size());
        for (String index : list)
            System.out.println(index + " ");
    }
}

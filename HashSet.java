
package collectionstest;
import java.util.*;
public class HashSet {
    public static void main(String[] args) {
        // creating Hashset and adding elements 
        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
           }
    
}

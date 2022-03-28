// Collection 


package collectionstest;
import java.util.*;
import java.util.Map.Entry;

public class HashMap {
    public static void main(String[] args) {
        HashMap<Integer ,String>map = new HashMap< >();
        map.put(1,"Roy");
        map.put(2,"Lewis");
        map.put(3,"Wilson");
        map.put(4,"Harris");
        
        for (Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }    
    }
    
}


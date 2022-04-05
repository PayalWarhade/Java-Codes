package Java_Collection;

import java.util.ArrayList;
import java.util.List;

public class ArreyListTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String> ();

		String str= "hi" ;

		list.add("string");

		list.add (str);

		list.add (str+ str);

		System.out.println (list.size());

		System.out.println (list.contains(0));

		System.out.println (list.contains ("hihi"));

		list.remove ("hi");

		System.out.println (list.size());

		list.add("hi");

		list.add(str);

		System.out.println (list.size());
	}
}
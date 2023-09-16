package collection;
import java.util.*;
public class TreeDemo2 {
	public static void main(String[] args) {
		SortedMap<Integer,String>sm=new TreeMap<Integer,String>();
		sm.put(3, "three");
		sm.put(2, null);
		sm.put(1, "one");
		sm.put(4, "four");
		sm.put(6, "null");
		sm.put(5, "five");
		System.out.println(sm);
	}

}

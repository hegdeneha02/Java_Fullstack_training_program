package collection;
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		SortedMap<String,String>sm=new TreeMap<String,String>();
		sm.put("Father","farmer");
		sm.put("Mother","Teacher");
		sm.put("Son","Engineer");
		sm.put("Daughter","Doctor");
		sm.put("Cousin","Manager");
		System.out.println(sm);
		for(SortedMap.Entry m:sm.entrySet()) {
			System.out.println(sm.firstKey()+" "+sm.lastKey());
		}
	}
}

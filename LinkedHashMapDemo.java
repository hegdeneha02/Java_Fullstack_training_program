package collection;
import java.util.*;
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String>li_hash_map=new LinkedHashMap<Integer,String>();
		li_hash_map.put(10,"Good");
		li_hash_map.put(15,"4");
		li_hash_map.put(20,"Good");
		li_hash_map.put(25,"Welcomes");
		li_hash_map.put(30,"Set");
		System.out.println(li_hash_map);
		System.out.println(li_hash_map.containsKey(20));
		System.out.println(li_hash_map.containsKey(5));
	}

}

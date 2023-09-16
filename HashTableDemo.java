package collection;
import java.util.*;
public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer,String>table=new Hashtable<Integer,String>();
		table.put(10, "layer");
		table.put(15, "line");
		table.put(20, "space");
		table.put(25, "size");
		Enumeration enu=table.elements();
		System.out.println("The Enumeration Of values are:");
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}
}

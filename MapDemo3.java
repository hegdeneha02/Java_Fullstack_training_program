package collection;
import java.util.*;
public class MapDemo3 {
	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(null, "MNC");
		map.put(null, "TCS");
		map.put(null, "Google");
		map.put(1004, "CTS");
		map.put(7005, "Vitrusa");
		System.out.println(map);
	}
}

package collection;
import java.util.*;
public class NavigableDemo {

	public static void main(String[] args) {
		NavigableMap<Integer,String>httpcode=new TreeMap<Integer,String>();
		httpcode.put(302,"God");
		httpcode.put(300,"Save");
		httpcode.put(400,"Bad");
		httpcode.put(200,"Ok");
		httpcode.put(404,"NotFound");
		System.out.println(httpcode);
		System.out.println(httpcode.pollFirstEntry());
		System.out.println(httpcode.pollLastEntry());
		System.out.println(httpcode);
		System.out.println(httpcode.firstEntry());
		System.out.println(httpcode.lastEntry());
		
	}

}

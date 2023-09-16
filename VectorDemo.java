package collection;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		Vector<String>animals=new Vector<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		System.out.println("Initial Vector:"+animals);
		//get method
		String element=animals.get(2);
        System.out.println("Get:"+element);
        //using iterator
        Iterator<String>it=animals.iterator();
        System.out.println("vector:");
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        //remove
        element=animals.remove(1);
        System.out.println("Removed element:"+element);

	}

}

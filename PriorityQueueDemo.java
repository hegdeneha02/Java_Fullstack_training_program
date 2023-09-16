package collection;
import java.util.*;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String>pq=new PriorityQueue<>();
		//core Java,React,HTML,Angular
		pq.add("core Java");
		pq.add("React");
		pq.add("HTML");
		pq.add("Angular");
		System.out.println(pq);
		pq.remove("Angular");
		System.out.println("After Remove:"+pq);
		System.out.println("Poll Method"+pq.poll());
		System.out.println("Final Queue:"+pq);
		Iterator<String>iterator=pq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"");
		}
		
	}

}

package collection;
import java.util.*;
public class DequeueDemo {
 public static void main(String[]args) {
	 Deque<Integer>deque=new ArrayDeque<>();
	 deque.addFirst(21);
	 deque.addLast(05);
	 System.out.println(deque);
 }
}

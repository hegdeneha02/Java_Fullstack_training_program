package Collection;
import java.util.*;
public class QueueDemo{
  public static void main(String [] args){
    Queue<Integer>queue=new LinkedList<Integer>();
    //Add the elements 
    for(int i=0;i<5;i++)
      {
        queue.add(i);
      }
    System.out.println("Elements in the Queue are:"+queue);
    //remove the head element
    int removed=queue.remove();
    System.out.println("Removed element:"+removed);
    System.out.println("Elements in the Queue are:"+queue);
    int head=queue.peak();
    System.out.println("Head Elements in the Queue:"+head);
    int size=queue.size();
    System.out.println("Size of the queue:"+size);
  }
} 

import java.util.PriorityQueue;
import java.util.Collections;
public class PQExample1{
	public static void main(String[] args){
		PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());
		maxHeap.add(10);
		maxHeap.add(5);
		maxHeap.add(30);
		System.out.println("priority Queue:"+maxHeap);
		System.out.println("Max:"+maxHeap.peek());
		System.out.println("Remove Max:"+maxHeap.poll());
		System.out.println("New Max:"+maxHeap.peek());
	}
}
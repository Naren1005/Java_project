package collections;
import java.util.*;

public class QUEUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		
		//Addition - offer, add
		//remove- poll, remove
		//retrieval - peek
		pq.add(20);
		pq.add(21);
		pq.add(22);
		pq.add(5);
		pq.offer(35);
		System.out.println(pq);
		System.out.println("Peek: "+pq.peek());
		//System.out.println("poll"+pq.poll());
		System.out.println("remove:"+pq.remove());
		System.out.println(pq);
		
		// priority will not be applied for the for loop
		for (Integer integer : pq) {
			System.out.println(integer);
			
		}
		System.out.println("**********************");
		//while loop prints the priority values
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
		}
		

	}

}

package collections;
import java.util.*;

public class DEQUEUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> dq= new ArrayDeque<>();
		
		//Addition - offer,OfferFirst,OfferLast -add,addFirst,addLast
		//
		//remove- poll,pollFirst,pollLast, remove,removeFirst,removeLast
		//retrieval - peek,peekFirst,peekLast
		dq.addFirst(200);
		dq.addLast(21);
		dq.add(22);
		dq.add(5);
		dq.offerFirst(35);
		System.out.println(dq);
		System.out.println("Peek: "+dq.peekFirst());
		//System.out.println("poll"+dq.poll());
		System.out.println("remove:"+dq.removeLast());
		System.out.println(dq);
		
		// priority will not be applied for the for loop
		for (Integer integer : dq) {
			System.out.println(integer);
			
		}
		System.out.println("**********************");
		//while loop prints the priority values
		while(!dq.isEmpty())
		{
			System.out.println(dq.poll());
		}
		

	}

}

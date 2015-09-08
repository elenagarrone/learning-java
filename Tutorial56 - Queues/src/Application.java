import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Application {

	public static void main(String[] args) {
		
		// In coding the items will leave at the head of the queue and enter at the tail.
		// (head) <- oooooooooooooooooooooo <- (tail) FIFO structure (first in, first out).
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3); // this is a queue with a maximum of 3 items.
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("Head of queue is: " + q1.element());
		
		// If we want we can try and catch the exception when we have more than 3 items in the queue:
		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add to many items to the queue.");
		}
		
		for(Integer value: q1) {
			System.out.println("Queue value: " + value);
		}
		
		// To remove;
		
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		
		try {
			System.out.println("Removed from queue: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Tried to removed too many items from queue.");
		}
		
		
		/////////////////////////////////////////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		// Peek return null when the queue is empty.
		System.out.println("Queue 2 peek: " + q2.peek());
		
		q2.offer(10);
		q2.offer(20);
		
		// Offer returns false if too many items.
		if(q2.offer(30) == false) {
			System.out.println("Offer failed to add third item.");
		}
		
		for(Integer value: q2) {
			System.out.println("Queue 2 value: " + value);
		}
		
		// Poll return null if not enough items.
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		
	}
	
}

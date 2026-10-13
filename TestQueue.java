import java.util.*;

public class TestQueue {

	public static void main(String[] args) {
		
		Queue<String> testQueue = new LinkedList<String>();
		
		testQueue.add("leo");
		testQueue.add("pablo");
		testQueue.add("Subhang");
		
		System.out.println("WaitingQueue : " + testQueue);

        // Removing an element from the Queue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the Queue is empty
        String name = testQueue.remove();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + testQueue);

        // Removing an element from the Queue using poll()
        // The poll() method is similar to remove() except that it returns null if the Queue is empty.
        name = testQueue.poll();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + testQueue);
        
        
	}

}

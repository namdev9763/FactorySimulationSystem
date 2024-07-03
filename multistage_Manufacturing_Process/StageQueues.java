package multistage_Manufacturing_Process;

import java.util.ArrayDeque;
import java.util.Deque;

public class StageQueues implements CommanMethod
{
	// here Deque is double ended Queue we can add and remove both side 
	private Deque<Item> dqueue;
	public StageQueues() {
		//we can add list class such as ArrayDeque and LinkedList
		this.dqueue=new ArrayDeque<>();
	}
	
	// Adds an item to the queue
	public void addItem(Item item)
	{
		dqueue.add(item);
	}
	// Remove item front of the queue
	public Item removeItem()
	{
		return dqueue.poll();
	}
	// check queue is empty or not 
	public boolean isEmptyItem()
	{
		return dqueue.isEmpty();
	}
	// check size of queue
	public int checkSize()
	{
		return dqueue.size();
	}
}

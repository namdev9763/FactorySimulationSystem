package multistage_Manufacturing_Process;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentStageQueues implements CommanMethod
{
	private ConcurrentLinkedDeque<Item> conLinkQueue;
	public ConcurrentStageQueues()
	{
		this.conLinkQueue=new ConcurrentLinkedDeque<>();
	}
	@Override
	public void addItem(Item item)
	{
		conLinkQueue.add(item);		
	}
	@Override
	public Item removeItem() {
		return conLinkQueue.poll();
	}
	@Override
	public boolean isEmptyItem() {
		return conLinkQueue.isEmpty();
	}
	@Override
	public int checkSize() {
		return conLinkQueue.size();
	}
}

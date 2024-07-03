package multistage_Manufacturing_Process;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class BlockingStageQueue implements CommanMethod {
	private BlockingDeque<Item> blockingQueue;
	public BlockingStageQueue()
	{
		this.blockingQueue=new LinkedBlockingDeque<>();
	}
	// blocking Queue to handle exception 
	@Override
	public void addItem(Item item) throws InterruptedException {
		blockingQueue.put(item);
	}
	@Override
	public Item removeItem() throws InterruptedException {
		return blockingQueue.poll(1,TimeUnit.SECONDS);
	}
	@Override
	public boolean isEmptyItem() {
		return blockingQueue.isEmpty() ;
	}
	@Override
	public int checkSize() {
		
		return blockingQueue.size();
	}	
}

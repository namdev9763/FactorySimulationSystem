package multistage_Manufacturing_Process;

import java.util.ArrayDeque;

public class SimpleStageQueues implements CommanMethod
{
	private ArrayDeque<Item> arrayDeque;
	public SimpleStageQueues() {
		this.arrayDeque=new ArrayDeque<>();	 
	}
	@Override
	public void addItem(Item item){
		arrayDeque.add(item);		
	}
	@Override
	public Item removeItem()  {
		return arrayDeque.poll();
	}
	@Override
	public boolean isEmptyItem() {
		return arrayDeque.isEmpty();
	}
	@Override
	public int checkSize() {
		return arrayDeque.size();
	}
}

package multistage_Manufacturing_Process;

public interface CommanMethod 
{
	public void addItem(Item item) throws InterruptedException, Exception ;
	public Item removeItem() throws InterruptedException,Exception ;
	public boolean isEmptyItem() throws InterruptedException;
	public int checkSize()  ;
}

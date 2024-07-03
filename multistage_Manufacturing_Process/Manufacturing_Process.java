package multistage_Manufacturing_Process;

public class Manufacturing_Process {

	public static void main(String[] args) throws InterruptedException {
	MultiStageProcessing multiStageProcessing=new MultiStageProcessing(4);
	multiStageProcessing.addItem(new Item(1, 0, 1,"First item"));
	multiStageProcessing.addItem(new Item(2, 0, 4,"Second item"));
	multiStageProcessing.addItem(new Item(3, 0, 3,"Third item"));
	multiStageProcessing.addItem(new Item(4, 0, 2,"Fourth item"));
	
	multiStageProcessing.startProcessing();
	
	Thread.sleep(5000);
	// end the process
	multiStageProcessing.shutdown();


	}

}

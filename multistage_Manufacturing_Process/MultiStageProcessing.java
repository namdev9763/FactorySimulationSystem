package multistage_Manufacturing_Process;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiStageProcessing
{
	private  BlockingStageQueue[] stages;
	private  ExecutorService executor;

	public MultiStageProcessing(int countStages)
	{
		stages=new BlockingStageQueue[countStages];
		for (int i = 0; i < countStages; i++) {
			stages[i] = new BlockingStageQueue();
		}
		executor = Executors.newFixedThreadPool(countStages);
	}
	// Adds an item to the first stage
	public void addItem(Item item) throws InterruptedException{
		stages[0].addItem(item);
	}

	//Starts the processing of items through the stages.
	public void startProcessing() {
		for (int i = 0; i < stages.length; i++) {
			final int stageIndex = i;
			executor.submit(() -> processStage(stageIndex));
		}
	}

	//Processes items at a specific stage and moves them to the next stage
	private void processStage(int stageIndex) {
		try {
			while (true) {
				Item item = stages[stageIndex].removeItem();
				System.out.println("Processing item " + item.getItemId() + " at stage " + stageIndex+" description "+item.getDescription());
				if (stageIndex < stages.length - 1) {
					item.setStage(stageIndex + 1);
					stages[stageIndex + 1].addItem(item);
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	 //Shuts down the processor
	public void shutdown() {
		executor.shutdownNow();
	}
}

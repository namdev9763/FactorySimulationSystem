package multistage_Manufacturing_Process;

public class Item {
	private int itemId;
	private int stage;
	private int priority;
	private String description;
	public Item(int itemId, int stage, int priority, String description) {
		super();
		this.itemId = itemId;
		this.stage = stage;
		this.priority = priority;
		this.description = description;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", stage=" + stage + ", priority=" + priority + ", description=" + description
				+ "]";
	}
}


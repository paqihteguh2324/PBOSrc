package week4;

public class Item {
	private String name;
	private Item() {
	 name = "ipin";
	}
	
	public Item(String name) {
		this();
	System.out.println(this.name);
	}
}

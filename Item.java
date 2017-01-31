
public abstract class Item {
	private String name = "";
	private String id = "";
	private String itemType = "";
	
	protected Item(String name, String itemType, String id){
		this.id = id;
		this.name = name;
		this.setItemType(itemType);
	}
	
	public String getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
	public String toString() {
		String temp = "";
			
		temp+= "Name: " + getName() + "\n";
		temp+= "ID: " + getId() + "\n";
		temp+= "Item Type: " + getItemType() + "\n";
		
		return temp;
	}
	

	public void print(){
		System.out.println("Name: " + name);
		System.out.println("Item Type: " + itemType);
		System.out.println("ID: " + id);
		
		System.out.println("Testing toString(): " + toString());
	}


	
}
public class DVD extends Item {

		public DVD(String name, String itemType, String id, String artist){
			super(name, itemType, id);					
		}

		public String toString() {
			String temp = "";
				
			temp+= "Name: " + getName() + "\n";
			temp+= "Type: " + getItemType() + "\n";
			temp+= "ID: " + getId() + "\n";
				
			return temp;
			}
		
		public void print(){
			System.out.println();
			System.out.println("Testing toString DVD " + toString());
		}
	}


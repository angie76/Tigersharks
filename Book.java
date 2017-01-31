
public class Book extends Item {
		private String author;

		public Book (String name, String itemType, String id, String artist){
			super(name, itemType, id);		
			this.setAuthor(author);
		}

		
		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}


		public String toString() {
			String temp = "";
				
			temp+= "Name: " + getName() + "\n";
			temp+= "Type: " + getItemType() + "\n";
			temp+= "ID: " + getId() + "\n";
			temp+= "Author: " + getAuthor() + "\n";
				
			return temp;
			}
		
		public void print(){
			System.out.println();
			System.out.println("Testing toString() BOOK: " + toString());
		}
	}


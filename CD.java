
public class CD extends Item {
		private String artist;


		public CD (String name, String itemType, String id, String artist){
			super(name, itemType, id);		
			this.setArtist(artist);
		}

		
		public String getArtist() {
			return artist;
		}


		public void setArtist(String artist) {
			this.artist = artist;
		}


		public String toString() {
			String temp = "";
				
			temp+= "Name: " + getName() + "\n";
			temp+= "Type: " + getItemType() + "\n";
			temp+= "ID: " + getId() + "\n";
			temp+= "Artist: " + getArtist() + "\n";
				
			return temp;
			}
		
		public void print(){
			System.out.println();
			System.out.println("Testing toString() CD: " + toString());
		}
	}


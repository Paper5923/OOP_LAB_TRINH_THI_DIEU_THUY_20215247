package hust.soict.globalict.aims.media;

import java.util.List;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	

	private String artist;
	
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(int length, String director) {
		super(length, director, director, cost);
		// TODO Auto-generated constructor stub
	}

	public String getArtist() {
		return artist;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if( !(obj instanceof Track)) return false;
		return((Track) obj).getTitle() == this.getTitle() && ((Track) obj).getLength() == this.getLength() ;
		
		
	}
	



//	public CompactDisc() {
//		
//	}
	public void play() {
	     System.out.println("List of tracks of artist: " + artist);
	     for(int i = 0; i < tracks.size(); i++) {
	    	 tracks.get(i).play();
	     }
	     
	}
	public void addTrack(String name) {
		int check = 0;
		for(int i = 0 ; i < tracks.size(); i++) {
			if( name.equals(tracks.get(i))) {
				System.out.println(name + "exists, cannot be added");
				check = 1;
				break;
			}	
		}
		if (check == 0) {
			tracks.add(name);
			System.out.println(name + "is add successfully!");
		}
	}
	
	public void removeAuthor(String name) {
		int check = 0;
		for(int i = 0 ; i < tracks.size(); i++) {
			if( name.equals(tracks.get(i))) {
				System.out.println("Remove " +  name + "successfully!");
				tracks.remove(i);
				check = 1;
				break;
			}	
		}
		if (check == 0) {
			
			System.out.println(name+ "does not exist, cannot be reomoved!");
		}
	}
	
	public int getLength() {
		//super();
		int sum = 0;
		for(int i = 0; i  < tracks.size(); i++) {
			sum += (tracks.get(i)).getLength();
		}
		return sum;
	}


}
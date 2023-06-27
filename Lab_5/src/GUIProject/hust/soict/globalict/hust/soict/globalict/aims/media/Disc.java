package hust.soict.globalict.aims.media;

public class Disc extends Media{
	private int length;
	private String director;
	
    
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}

    public Disc(int id, String title, String category,float cost) {
    	super(id, category, category, cost);
			}
//		
//		// TODO Auto-generated constructor stub
//	}
    public String toString() {
    	return "DC [id" + getId() + ". title = " + getTitle() + ", category =" + getCategory() + "cost = " + getCost() + ", length = " + length + ", director = " + director;
    	
    }

}
package hust.soict.globalict.aims.media;

import java.util.List;
import java.util.ArrayList;
public class Book extends Media {
//	private int  id;
//	private String title; 
//	private String category;
//	private float cost;
	private List<String> authors = new ArrayList<String>();
	
	
  
	public Book(int id, String title, String category,float cost) {
	     super(id, category, category, cost);
	}
	
	
	public void addAuthor(String authorName) {
		int check = 0;
		for(int i = 0 ; i < authors.size(); i++) {
			if( authorName.equals(authors.get(i))) {
				System.out.println(authorName + "exists, cannot be added");
				check = 1;
				break;
			}	
		}
		if (check == 0) {
			authors.add(authorName);
			System.out.println(authorName + "is add successfully!");
		}
	}
	
	
	public void removeAuthor(String authorName) {
		int check = 0;
		for(int i = 0 ; i < authors.size(); i++) {
			if( authorName.equals(authors.get(i))) {
				System.out.println("Remove " +  authorName + "successfully!");
				authors.remove(i);
				check = 1;
				break;
			}	
		}
		if (check == 0) {
			
			System.out.println(authorName + "does not exist, cannot be reomoved!");
		}
	}
	

}
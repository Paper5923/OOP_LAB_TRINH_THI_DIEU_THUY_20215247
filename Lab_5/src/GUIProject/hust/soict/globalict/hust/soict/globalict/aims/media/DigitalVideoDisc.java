package hust.soict.globalict.aims.media;


import java.lang.constant.DynamicConstantDesc;

public class DigitalVideoDisc extends Disc implements Playable{
	 public DigitalVideoDisc(int id, String title, String category,float cost) {
    	super(id, category, category, cost);
		}


	public void play() {
		  System.out.println("Playing DVD: " + this.getTitle());
		  System.out.println("DVD length: " + this.getLength());
	  }





}
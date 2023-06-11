package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;



import java.util.ArrayList;
import java.util.List;


public class Cart {

    public static final int  MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsOrdered = new ArrayList<Media>();
    
//    private Media itemsOrdered[] = new Media[MAX_NUMBERS_ORDERED];
    public boolean equals(Object obj) {
		if(obj instanceof Media) {
			Media media = (Media) obj;
			return this.getTitle().equals(media.getTitle());
	     }
		return false;
	}
    
    public void addMedia(Media media){
        if( itemsOrdered.size() == MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full!");
            return;
        }else{
            itemsOrdered.add(media);
         
            System.out.println("The media has been added!");
        }
        
    }

    public void removeMedia(Media media){
        int check = 0; // check xem co tim thay k
        int find = -1; // luu chi so cua cai muon xoa bo
        
        if( itemsOrdered.size() == 0){ // check xem cart empty or not
            System.out.println("The cart is empty!");
            return;
        }

        for(int i = 0; i < itemsOrdered.size(); i++){
            if( itemsOrdered.get(i) == media ){
                find = i;
                check = 1;
                break;
            }
        }
        if (check == 1){ // thay doi lai thu tu disc sau khi xoa 1 disc
            for(int i = find; i < itemsOrdered.size() ; i++ ){
           //     itemsOrdered[find] = itemsOrdered[find + 1]; 
            	  itemsOrdered.set(i, itemsOrdered.get(i+1));
                
            }
            itemsOrdered.remove(itemsOrdered.size());
            System.out.println("The media has been removed from the cart!");

        }

    }

    public float totalCost(){
        float total = 0;
        for(int i = 0; i < itemsOrdered.size(); i++){
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }
    public Media findByTitle(String name) {
    	for(int i = 0; i < itemsOrdered.size(); i++){
           if( name.equals(itemsOrdered.get(i).getTitle() )) return itemsOrdered.get(i);
        }
    	return null;
    }
    
    public Media findById(int num) {
    	for(int i = 0; i < itemsOrdered.size(); i++){
            if( num == itemsOrdered.get(i).getId() ) return itemsOrdered.get(i);
         }
     	return null;
    }
    
    public void showByID(int num) {
    	for(int i = 0; i < itemsOrdered.size(); i++){
            if( num == itemsOrdered.get(i).getId() ) System.out.println(itemsOrdered.get(i).toString());
         }
    }
    
    
    public void showByTitle(String name) {
    	for(int i = 0; i < itemsOrdered.size(); i++){
            if( name.equals(itemsOrdered.get(i).getTitle() )) System.out.println(itemsOrdered.get(i).toString());
         }
    }
    
    public int sizeOfCart() {
    	return itemsOrdered.size();
    }
    public void sortByCost() {
    	for(int i = 0; i < itemsOrdered.size() ; i++) {
    		this.itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
    	}
    }
    public void sortByTitle() {
    	for(int i = 0; i < itemsOrdered.size() ; i++) {
    		this.itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
    	}
    }
    public void removeMediaByTitle(String name) {
    	int find = -1;
    	for(int i = 0; i <itemsOrdered.size() ; i++ ) {
    		if(name.equals(itemsOrdered.get(i).getTitle())) {
    			find = i;
    			break;
    		}
    	}
    	for(int i = find; i < itemsOrdered.size() ; i++ ){
            
    		itemsOrdered.set(i, itemsOrdered.get(i+1));
                 
             }
    	     itemsOrdered.remove(itemsOrdered.size());
             System.out.println("The media has been removed from the cart!");

    	
    }
    
    
}


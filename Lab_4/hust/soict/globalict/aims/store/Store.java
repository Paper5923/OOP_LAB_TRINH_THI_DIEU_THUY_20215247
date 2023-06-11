package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
	public static final int  MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsInStore= new ArrayList<Media>();
    
//    private Media itemsOrdered[] = new Media[MAX_NUMBERS_ORDERED];
    public void addMedia(Media media){
        if( itemsInStore.size() == MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full!");
            return;
        }else{
        	itemsInStore.add(media);
         
            System.out.println("The media has been added!");
        }
        
    }

    public void removeMedia(Media media){
        int check = 0; // check xem co tim thay k
        int find = -1; // luu chi so cua cai muon xoa bo
        
        if( itemsInStore.size() == 0){ // check xem cart empty or not
            System.out.println("The cart is empty!");
            return;
        }

        for(int i = 0; i < itemsInStore.size(); i++){
            if( itemsInStore.get(i) == media ){
                find = i;
                check = 1;
                break;
            }
        }
        if (check == 1){ // thay doi lai thu tu disc sau khi xoa 1 disc
            for(int i = find; i < itemsInStore.size() ; i++ ){
           //     itemsOrdered[find] = itemsOrdered[find + 1]; 
            	itemsInStore.set(i, itemsInStore.get(i+1));
                
            }
            itemsInStore.remove(itemsInStore.size());
            System.out.println("The media has been removed from the cart!");

        }

    }
    
    public void viewStore() {
    	System.out.println("Items in Store");
    	for(int i = 0; i < itemsInStore.size(); i++) {
    		System.out.println(itemsInStore.toString());
    		
    	}
    }
    public int findMediaByTitle(String titleMedia) {
    	int check = -1;
    	for(int i = 0; i < itemsInStore.size() ; i++ ) {
    		if(titleMedia.equals(itemsInStore.get(i)) ) {
    			check = i;
    			itemsInStore.toString();
    			break;
    			
    		}
    		
    	}
    	return check;
    	
    	
    }
    public String showMediaById(int id) {
    	return itemsInStore.get(id).toString();
    }
    public Media findByTitle(String name) {
    	for(int i = 0; i < itemsInStore.size(); i++){
           if( name.equals(itemsInStore.get(i).getTitle() )) return itemsInStore.get(i);
        }
    	return null;
    }
    
    public void removeMediaByTitle(String name) {
    	int find = -1;
    	for(int i = 0; i < itemsInStore.size() ; i++ ) {
    		if(name.equals(itemsInStore.get(i).getTitle())) {
    			find = i;
    			break;
    		}
    	}
    	for(int i = find; i < itemsInStore.size() ; i++ ){
            
             	itemsInStore.set(i, itemsInStore.get(i+1));
                 
             }
             itemsInStore.remove(itemsInStore.size());
             System.out.println("The media has been removed from the cart!");

    	
    }
}
	


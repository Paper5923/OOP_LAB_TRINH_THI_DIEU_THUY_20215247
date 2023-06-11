package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.store.Store;

import java.util.Scanner;

public class Aims{
	
	static Store store = new Store();
    static Cart cart = new Cart();
    public static void main(String[] args) {
    	
        int show = 0;
        Scanner scanner = new Scanner(System.in);
        do {
        	showMenu();// show menu 
        	show = scanner.nextInt();
        	switch(show) {
        	case 1: // view Store
        		seeMediaDetail();
        		break;
        	case 2: 
        		UpdateStore();
        		break;
        	case 3: 
        		seeCurrentCart();
        		break;
        	case 0:
        		break;
        	default:
        		System.out.println("Invalid choice");
        	}
        }while ( show >=0 && show <=3);
        			
        		
        		
        	
    }
        	
        
    
    public static void showMenu() {
    	System.out.println("AIMS: ");
    	System.out.println("------------------");
    	System.out.println("1. View store");
    	System.out.println("2. Update store");
    	System.out.println("3. See current cart");
    	System.out.println("0. Exit");
    	System.out.println("------------------");
    	System.out.println("Please choose a number: 0 - 1 - 2 - 3");
    	
    }
    
    public static void storeMenu(){
    	System.out.println("Option: " );
    	System.out.println("----------------------");
    	System.out.println("1. See a media' s details");
    	System.out.println("2. Add a media to cart");
    	System.out.println("3. Play a media");
    	System.out.println("4. See current cart");
    	System.out.println("0. Back");
    	System.out.println("------------------------");
    	System.out.println("Please choose a number: 0 - 1 - 2 - 3 - 4");
    }
    
    public static void mediaDetailsMenu() {
    	
    	System.out.println("Options: ");
    	System.out.println("--------------------------");
    	System.out.println("1. Add to cart");
    	System.out.println("2. Play");
    	System.out.println("0. Back");
    	System.out.println("---------------------------");
    	System.out.println("Please choose a number: 0 - 1 - 2");
    	
    	
    }
    
    public static void cartMenu() {
    	System.out.println("Options: ");
    	System.out.println("------------------------");
    	System.out.println("1. Filter medias in cart");
    	System.out.println("2. Sort medias in cart");
    	System.out.println("3. Remove media from cart");
    	System.out.println("4. Play a media");
    	System.out.println("5. Place order");
    	System.out.println("0. Back");
    	System.out.println("--------------------------");
    	System.out.println("Please choose a number: 0 - 1 - 2 -3 - 4 - 5");
    	
    }
    
    public static void seeMediaDetail() {
    	Scanner scanner = new Scanner(System.in);
    	String medTitle;
    	System.out.println("Enter the title: ");
    	medTitle = scanner.nextLine();
    	int existOfTitle = store.findMediaByTitle(medTitle);
    	
		if( existOfTitle == -1) System.out.println("The Store does not have this media");
		else System.out.println(store.showMediaById(existOfTitle));
		
		mediaDetailsMenu();
		
		int chooseDetailMenu = scanner.nextInt();
		int id;
		String category;
		float cost;
		
		switch (chooseDetailMenu) {
		case 1: 
			if (existOfTitle != -1) System.out.println("This Media has been already");
			else {
				String chooseMedia;
				System.out.println("You want to add book, DC or DVD !?");
				chooseMedia = scanner.nextLine();
				System.out.println("Enter id: ");
				id = scanner.nextInt();
				System.out.println("Enter category: ");
				category = scanner.nextLine();
				System.out.println("Enter cost: ");
				cost = scanner.nextInt();
				if( chooseMedia.equals("book")) {
					Book book = new Book(id, medTitle, category, cost);
					store.addMedia(book);
				}
				else if( chooseMedia.equals("DC")) {
					Disc book = new Disc(id, medTitle, category, cost);
					store.addMedia(book);
					
				}
				else {
					DigitalVideoDisc book = new DigitalVideoDisc(id, medTitle, category, cost);
					store.addMedia(book);
					
				}
			}
			    break;
			case 2: 
				if( existOfTitle == -1) System.out.println("The Store does not have this media");
				else System.out.println(store.showMediaById(existOfTitle));
				break;
			case 0: 
				break;
			default: 
				System.out.println("Invalid choice");
			
			
		
		}
		
    	
    }

		public static void addToCart() {
			
			Scanner scanner = new Scanner(System.in);
			store.viewStore();
			System.out.println("Entet title u want to add on the cart; ");
			String title = scanner.nextLine();
			cart.addMedia(store.findByTitle(title));
			System.out.println("Number of Medias in Cart: " + cart.sizeOfCart());
		}
		
  
	public static void UpdateStore() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Do you want to remove(1) or add(2) a media?");
		int update = scanner.nextInt();
		if( update == 2) {
			int id;
			String category;
			float cost;
			String medTitle;
			String chooseMedia;
			System.out.println("You want to add book, DC or DVD !?");
			chooseMedia = scanner.nextLine();
			System.out.println("Enter id: ");
			id = scanner.nextInt();
			System.out.println("Enter title: ");
			medTitle = scanner.nextLine();
			System.out.println("Enter category: ");
			category = scanner.nextLine();
			System.out.println("Enter cost: ");
			cost = scanner.nextInt();
			if( chooseMedia.equals("book")) {
				Book book = new Book(id, medTitle, category, cost);
				store.addMedia(book);
			}
			else if( chooseMedia.equals("DC")) {
				Disc book = new Disc(id, medTitle, category, cost);
				store.addMedia(book);
				
			}
			else {
				DigitalVideoDisc book = new DigitalVideoDisc(id, medTitle, category, cost);
				store.addMedia(book);
				
			}
			
		}else {
			System.out.println("Enter the title of media you want to remove: ");
			String name = scanner.nextLine();
			store.removeMediaByTitle(name);
			
			
			
		}
	}
	public static void seeCurrentCart() {
		Scanner scanner = new Scanner(System.in);
		cartMenu();
		int choose = scanner.nextInt();
		
		switch (choose) {
		case 1:
			System.out.println("Filter by title(1) or ID(2) ?");
			int ch1 = scanner.nextInt();
			if( ch1 == 1) {
				System.out.println("Enter title: ");
				String name = scanner.nextLine();
				cart.showByTitle(name);
			}else {
				System.out.println("Enter id: ");
				int name = scanner.nextInt();
				cart.showByID(name);
			}
			break;
		case 2: 
			
			System.out.println("Filter by title(1) or cost(2) ?");
			int ch2 = scanner.nextInt();
			if( ch2 == 1) {
				cart.sortByTitle();
				
			}else {
				cart.sortByCost();
			}
			break;
		case 3: 
			System.out.println("Enter the title of media you want to remove: ");
			String name = scanner.nextLine();
			cart.removeMediaByTitle(name);
			break;
		case 4: 
			System.out.println("Enter the title of media you want to play: ");
			String name2 = scanner.nextLine();
			cart.showByTitle(name2);
			break;
		case 0:
			break;
		default:
			System.out.println("Invalid default!");
			
				
			 
				
	}
	}
}


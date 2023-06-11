package lab;
import java.util.Comparator;
public class MediaComparatorByCostTitle implements Comparator<Media>{
	

	
	@Override
	public int compare(Media o1, Media o2) {
		int ans = Float.compare(o2.getCost(), o1.getCost());
		
		return ans != 0 ? result : o1.getTitle().compareTo(o2.getTitle());
	}

}

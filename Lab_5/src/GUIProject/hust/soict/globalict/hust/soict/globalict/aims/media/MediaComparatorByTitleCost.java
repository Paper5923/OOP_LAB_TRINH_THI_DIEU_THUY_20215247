package hust.soict.globalict.aims.media;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{

	
	@Override
	public int compare(Media o1, Media o2) {
		int result = o1.getTitle().compareTo(o2.getTitle());
		return result != 0 ? result : Float.compare(o2.getCost(), o1.getCost());
	}

}
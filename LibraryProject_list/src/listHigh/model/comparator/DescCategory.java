package listHigh.model.comparator;

import java.util.Comparator;
import listHigh.model.vo.Book;



public class DescCategory implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		if(obj1 instanceof Book && obj2 instanceof Book) {
			
			return ((Book)obj1).getCategory()-((Book)obj2).getCategory();
		}
		return 0;
	}

}

package music.model.comparator;

import java.util.Collections;
import java.util.Comparator;

import music.model.vo.Music;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		
		return o1.getTitle().compareTo(o2.getTitle());
	}

	
	
	
}

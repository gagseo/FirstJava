package music.model.comparator;

import java.util.Comparator;

import music.model.vo.Music;

public class DescArtist implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		return o2.getArtist().compareTo(o1.getArtist());
	}

}

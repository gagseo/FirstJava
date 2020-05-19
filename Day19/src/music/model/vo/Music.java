package music.model.vo;

public class Music implements Comparable<Music>{

	private String artist;
	private String title;

	public Music() {

	}

	public Music(String artist, String title) {
		super();
		this.artist = artist;
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Music [artist=" + artist + ", title=" + title + "]";
	}

	public int compareTo(Music o) {
		return 0;
	}

}

package model.vo;

public abstract class Movie implements DisCountable {

	private String mName;
	private int mPrice;
	private String mGenre;
	private int mSeat;
	private int mTime;

	public Movie() {

	}

	public Movie(String mName, int mPrice, String mGenre, int mSeat, int mTime) {
		super();
		this.mName = mName;
		this.mPrice = mPrice;
		this.mGenre = mGenre;
		this.mSeat = mSeat;
		this.mTime = mTime;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public int getmPrice() {
		return mPrice;
	}

	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}

	public String getmGenre() {
		return mGenre;
	}

	public void setmGenre(String mGenre) {
		this.mGenre = mGenre;
	}

	public int getmSeat() {
		return mSeat;
	}

	public void setmSeat(int mSeat) {
		this.mSeat = mSeat;
	}

	public int getmTime() {
		return mTime;
	}

	public void setmTime(int mTime) {
		this.mTime = mTime;
	}

	@Override
	public String toString() {
		return "Movie [영화제목 = " + mName + ", 티켓가격 = " + mPrice + ", 장르 = " + mGenre + ", 잔여좌석수 = " + mSeat + ", 상영시작시간=" + mTime
				+ "]";
	}

}

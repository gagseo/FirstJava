package model.vo;

public class AdultM extends Movie {

	private int accessAge;

	public AdultM() {
		super();
	}

	public AdultM(String mName, int mPrice, String mGenre, int mSeat, int mTime, int accessAge) {
		super(mName, mPrice, mGenre, mSeat, mTime);
		this.accessAge = accessAge;
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return super.toString() + " 연령제한=" + accessAge + "]";
	}

	@Override
	public void disCount() {

	}

}

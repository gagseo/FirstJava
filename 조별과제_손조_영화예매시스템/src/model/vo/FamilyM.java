package model.vo;

public class FamilyM extends Movie {

	public FamilyM() {
		super();
	}

	public FamilyM(String mName, int mPrice, String mGenre, int mSeat, int mTime) {
		super(mName, mPrice, mGenre, mSeat, mTime);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public void checkTheater() {

	}

	@Override
	public void disCount() {

	}
}

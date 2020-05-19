package tour.model.vo;


public class Airline {

	private String contry;
	private int mileage;
	private int airfare;
	
	
	public Airline() {
		
	}


	public Airline(String contry, int mileage, int airfare) {
		super();
		this.contry = contry;
		this.mileage = mileage;
		this.airfare = airfare;
	}


	public String getContry() {
		return contry;
	}


	public void setContry(String contry) {
		this.contry = contry;
	}


	public int getMileage() {
		return mileage;
	}


	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


	public int getAirfare() {
		return airfare;
	}


	public void setAirfare(int airfare) {
		this.airfare = airfare;
	}

	
}


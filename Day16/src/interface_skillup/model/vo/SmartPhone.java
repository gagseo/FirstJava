package interface_skillup.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {

	private String model;
	
	public SmartPhone() {

	}

	public SmartPhone(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "SmartPhone [model=" + model + "]";
	}

	public abstract void printMaker();
	
}

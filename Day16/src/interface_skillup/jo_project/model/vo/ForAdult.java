package interface_skillup.jo_project.model.vo;

public class ForAdult extends Product {

	private int accessAge;

	public ForAdult() {
		super();
	}

	public ForAdult(String pName, int pPrice, int stock, int accessAge) {
		super(pName, pPrice, stock);
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
		return super.toString() + "ForAdult [accessAge=" + accessAge + "]";
	}

}

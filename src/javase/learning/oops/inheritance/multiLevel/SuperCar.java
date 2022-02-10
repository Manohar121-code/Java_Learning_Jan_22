package javase.learning.oops.inheritance.multiLevel;

public class SuperCar extends Car {

	private String company;
	private int topSpeed;
	private boolean isRoofTop;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public boolean isRoofTop() {
		return isRoofTop;
	}

	public void setRoofTop(boolean isRoofTop) {
		this.isRoofTop = isRoofTop;
	}

}

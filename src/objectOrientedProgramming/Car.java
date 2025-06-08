package objectOrientedProgramming;

public class Car {
	private String make;
	private String model;
	private int doors;
	private boolean convertible;

	public void setMake(String make){
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	public String getMake(){
		return this.make;
	}

	public String getModel() {
		return model;
	}

	public int getDoors() {
		return doors;
	}

	public boolean isConvertible() {
		return convertible;
	}

	public String getDescription(){
		if(this.make == null || this.model == null || this.doors == 0){
			return "This car is not fully initialised, or has invalid values. Check and try again!";
		}else{
			return this.doors + " - Doors " + this.make + " " + this.model + " " + (this.convertible == true ? "Convertible":"Not Convertible");
		}
	}
}

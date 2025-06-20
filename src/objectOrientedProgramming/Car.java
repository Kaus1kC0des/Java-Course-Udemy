package objectOrientedProgramming;

public class Car extends Vehicle {

    private String brand;
    private String licensePlate;

    public Car(String brand, String licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        super.name = "Error";

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}

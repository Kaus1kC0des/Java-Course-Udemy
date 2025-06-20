package objectOrientedProgramming;

public class Vehicle {
    private String engine;
    public int numberOfSeats;
    public String name;
    public int numberOfDoors;
    public int numberOfWheels;

    public void move(String direction){
        System.out.println("Moving " + direction);
    }

    public void insertKey(){
        System.out.println("Inserting keys.........");
    }


    public String getEngine(String user) {
        if(
                user.toLowerCase() == "Manager" ||
                        user.toLowerCase() == "Engineer"
        ){
            return this.engine;
        }
        return "";
    }

    public void setEngine(String engine) {
        if(engine == "BS-6"){
            this.engine = engine;
        }
    }
}
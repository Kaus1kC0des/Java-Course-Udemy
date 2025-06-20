package objectOrientedProgrammingPart1;


import java.time.Year;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public Worker(String name, String birthDate){
        this(name, birthDate, "01/01/9999");
    }

    public Worker(String name){
        this(name, "01/01/2000");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    public int getAge(){
        int year = Integer.parseInt(this.birthDate.split("/")[2]);
        int thisYear = Year.now().getValue();
        return thisYear - year;
    }

    public double collectPay(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

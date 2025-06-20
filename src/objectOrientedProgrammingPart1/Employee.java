package objectOrientedProgrammingPart1;

public class Employee extends Worker {
    private static long idCounter = 1;
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, String endDate, String hireDate) {
        super(name, birthDate, endDate);
        employeeId = Employee.idCounter++;
        this.hireDate = hireDate;
    }
    public Employee(String name, String birthDate, String hireDate){
        this(name, birthDate, null, hireDate);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

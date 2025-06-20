package objectOrientedProgrammingPart1;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, endDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public void retire(){
        System.out.println("Hello " + super.getName() + "! You have been retired, enjoy your life ahead. We wish you all the best :)");
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }
}



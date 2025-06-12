package Inheritance;

public class Company {
    private String name;
    private String ceo;
    private String headOfficeAddress;
    private String industry;

    public Company(String name, String ceo, String headOfficeAddress, String industry) {
        this.name = name;
        this.ceo = ceo;
        this.headOfficeAddress = headOfficeAddress;
        this.industry = industry;
    }

    // Chaining constructors for flexibility
    public Company(String name) {
        this(name, "Unknown", "Unknown", "Unknown");
    }

    public Company(String name, String ceo) {
        this(name, ceo, "Unknown", "Unknown");
    }

    public Company(String name, String ceo, String headOfficeAddress) {
        this(name, ceo, headOfficeAddress, "Unknown");
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", ceo='" + ceo + '\'' +
                ", headOfficeAddress='" + headOfficeAddress + '\'' +
                ", industry='" + industry + '\'' +
                '}';
    }
}
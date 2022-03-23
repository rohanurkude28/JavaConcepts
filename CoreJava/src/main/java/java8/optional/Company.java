package java8.optional;

public class Company {

    private String name;
    private int noOfEmployees;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", noOfEmployees=" + noOfEmployees +
                ", department='" + department + '\'' +
                '}';
    }
}

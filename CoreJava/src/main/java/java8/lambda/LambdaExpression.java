package java8.lambda;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class LambdaExpression {

    public static void displayList(Employee emp) {
        System.out.println("Hello " + emp.getName() + " your employee ID is: " + emp.getId());
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ross"));
        employees.add(new Employee(2, "Chandler"));
        employees.add(new Employee(3, "Joey"));

        employees.forEach(emp -> {
            System.out.println("Hello " + emp.getName() + " your employee ID is: " + emp.getId());
        });

        employees.forEach((LambdaExpression::displayList));
    }
}

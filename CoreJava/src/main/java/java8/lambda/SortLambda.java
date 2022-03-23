package java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Department {
    private String name;
    private int Id;

    public Department(String name, int id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public static int nameCompare(Department a1, Department a2) {
        return a1.name.compareTo(a2.name);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }
}

public class SortLambda {
    public static void main(String[] args) {
        Department[] departments  = {
                new Department("IT",1),
                new Department("HR",2),
                new Department("HR",3),
                new Department("Finance",4),
                new Department("Admin",2)};

        System.out.println("Before Sorting Names: "+Arrays.toString(departments));
        Arrays.sort(departments, Department::nameCompare);
        System.out.println("After Sorting Names "+Arrays.toString(departments));

        List<Department> departmentList =Arrays.asList(departments);
        departmentList.sort(Comparator.comparing(Department::getName).reversed());
        System.out.println("After Reverse Sorting Names "+departmentList);

        Arrays.sort(departments, Department::nameCompare);
        System.out.println("After Sorting Names "+Arrays.toString(departments));

        departmentList.sort(Comparator.comparing(Department::getName).thenComparing(Department::getId));
        System.out.println("After Sorting Names and then Comparing ID "+departmentList);
    }
}

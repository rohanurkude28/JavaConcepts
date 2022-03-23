package oops;

interface InterfaceEncapsulation {
    void eat();
}

public class Encapsulation implements InterfaceEncapsulation{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 55) {
            throw new IllegalArgumentException("Age must be from 18 to 55");
        }
        this.age = age;
    }

    @Override
    public void eat() {

    }
}

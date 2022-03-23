package oops;

interface InheritanceParent {
    void eat();

    void move();

    void sleep();

    private void workout(){
        System.out.print("Working out Interface...");
    }

    default void entertain() {
        System.out.println("Entertain MyInterface");
    }
}

public class InheritanceInterface implements InheritanceParent{

    public void eat() {
        System.out.print("Eating...");
    }

    public void move() {
        System.out.print("Moving...");
    }

    public void sleep() {
        System.out.print("Sleeping...");
    }

    @Override
    public void entertain() {
        System.out.println("Entertain MyInterface");
    }

}

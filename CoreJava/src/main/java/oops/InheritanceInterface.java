package oops;

interface InheritanceParent {
    void eat();

    void move();

    void sleep();

    private void workout(){
        System.out.print("Working out Interface...");
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

}

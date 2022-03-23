package oops;

abstract class InheritanceAbstractParent {
    abstract void eat();

    private void move(){
        System.out.println("Move like InheritanceAbstractParent");
    }

    void sleep(){
        System.out.println("Sleep like InheritanceAbstractParent");
    }

    void workout(){
        System.out.println("Workout like InheritanceAbstractParent");
    }

    static void entertain() {
        System.out.println("Entertaining like InheritanceAbstractParent");
    }
}

public class InheritanceAbstract extends InheritanceAbstractParent{
    @Override
    void eat() {
        System.out.println("Eat like InheritanceAbstract");
    }

    //Not overriding
    void move() {
        System.out.println("Move like InheritanceAbstract");
    }

    @Override
    void workout(){
        super.workout();
        System.out.println("Workout like InheritanceAbstract");
    }

    static void entertain() {
        System.out.println("Entertaining like InheritanceAbstract");
    }

    public static void main(String[] args) {
        InheritanceAbstract anAbstract = new InheritanceAbstract();
        anAbstract.eat();
        anAbstract.move();
        anAbstract.sleep();
        anAbstract.workout();
        entertain();
        InheritanceAbstractParent.entertain();
    }
}

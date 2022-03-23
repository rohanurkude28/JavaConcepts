package corejava;

public class OrderOfExecution {
    private int Id;
    private String name;

    public OrderOfExecution(){
        System.out.println("Default Constructor");
    }

    public OrderOfExecution(int id, String name) {
        //this(); will call default constructor
        Id = id;
        this.name = name;
        System.out.println("Parameterised Constructor");
    }

    {
        System.out.println("Instance Block");
    }

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        OrderOfExecution orderOfExecution1 = new OrderOfExecution();
        OrderOfExecution orderOfExecution2 = new OrderOfExecution(1,"Rohan");
    }
}

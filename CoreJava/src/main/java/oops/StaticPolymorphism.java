package oops;

public class StaticPolymorphism {

    private static int add(int a,int b){
        System.out.println("Int Method called");
        return a+b;
    }

    private static int add(float a,float b){
        System.out.println("Float Method called");
        System.out.println();
        return (int)(a+b);
    }

    public static void main(String[] args) {
        add(1,2);
        add(1.0f,2.0f);
    }
}

package exceptions;


import java.io.IOException;

class Parent {

    // defining the method
    void msg() {
        System.out.println("parent method");
    }

    void msg2()throws ArithmeticException {
        System.out.println("parent method2");
    }

    void msg3()throws Exception {
        System.out.println("parent method3");
    }

    void msg4() throws Exception {
        System.out.println("parent method4");
    }

    void msg5()throws Exception {
        System.out.println("parent method5");
    }
}

class TestExceptionChild extends Parent {

//    Gives compile time error cause of checked exception
//    void msg() throws IOException {
//        System.out.println("TestExceptionChild");
//    }

    // compiles cause of unchecked exception
    void msg() throws ArithmeticException {
        System.out.println("child method");
    }

//    Must be downcasted while throwing execption
//    void msg2()throws Exception {
//        System.out.println("child method");
//    }

    void msg3()throws IOException {
        System.out.println("parent method2");
    }

    void msg4() throws Exception {
        System.out.println("parent method4");
    }

    void msg5() {
        System.out.println("parent method5");
    }
}

public class OverrideExeception {
}

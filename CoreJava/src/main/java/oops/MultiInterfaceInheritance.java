package oops;

interface Moveable {
    public void start();

    public void stop();

    public void move();
}

interface Controllable extends Moveable {
    public void turn();

    public void brake();
}

public class MultiInterfaceInheritance implements Moveable,Controllable{
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void move() {

    }

    @Override
    public void turn() {

    }

    @Override
    public void brake() {

    }
}

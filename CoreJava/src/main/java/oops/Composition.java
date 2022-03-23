package oops;

class Engine {

    private String type;

}

public class Composition {
    private final Engine engine;

    public Composition() {
        engine = new Engine(); // Constructor based Injection
    }

    public Composition(Engine engine) {
        this.engine = engine;
    }
}

package exceptions;

public class CustomTryCatchResource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Closed MyResource");
    }
}

package exceptions;

import java.io.FileNotFoundException;

public class MultiCatchException {

    public static void main(String[] args) {
        try {
            //Do Something wrong
            int a = 1;
            if (a == 1)
                throw new NoSuchFieldException();
            throw new IllegalAccessException();
        } catch (IllegalArgumentException | SecurityException | IllegalAccessException |
                NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }
//        catch (Exception | IllegalAccessException |
//                NoSuchFieldException e) {
//            System.out.println(e.getMessage());
//        }  // Compile Time error cause of disjoint
    }
}

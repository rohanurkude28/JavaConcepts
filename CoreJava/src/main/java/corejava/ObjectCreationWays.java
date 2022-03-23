package corejava;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreationWays implements Cloneable, Serializable {

    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        // Super() keyword refers to parent class
        return super.clone();
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException {

        //Way 1
        ObjectCreationWays way1 = new ObjectCreationWays();

        //Way 2
        Class cls = Class.forName("corejava.ObjectCreationWays");

        ObjectCreationWays way21 = (ObjectCreationWays)cls.newInstance();
        ObjectCreationWays way22 = (ObjectCreationWays)cls.getDeclaredConstructor().newInstance(); //Since Java9

        //Way 3
        ObjectCreationWays way3 = (ObjectCreationWays)way1.clone();

        //Way 4
        FileOutputStream f
                = new FileOutputStream("file.txt");
        ObjectOutputStream oos
                = new ObjectOutputStream(f);
        oos.writeObject(way1);
        oos.close();
        f.close();

        FileInputStream fis = new FileInputStream("file.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ObjectCreationWays way4 = (ObjectCreationWays)ois.readObject();
        ois.close();
        fis.close();

        //Way 5
        Constructor<ObjectCreationWays> constructor
                = ObjectCreationWays.class.getDeclaredConstructor();

        ObjectCreationWays way5 = constructor.newInstance();

        System.out.println(String.format("Way1=%s;Way21=%s;Way22=%s;Way3=%s;Way4=%s;Way5=%s;", way1, way21, way22, way3, way4, way5));

    }
}

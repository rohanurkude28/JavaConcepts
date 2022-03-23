package principles;

class TightlyCoupledA
{
    public String name; 	//public data member of A class


    public String getName()
    {
        if(name!=null)  //Checking a valid access of instance variable, "name"
            return name;
        else
            return "not initiaized";
    }


    public void setName(String s)
    {
        if (s==null)  //Checking a valid setting of instance variable, "name"
            System.out.println("You can't initialized name to a null");
        else
            name = s;
    }
}



class TightlyCoupledB
{
    public static void main(String... ar)
    {
        //Creating an object of class A
        TightlyCoupledA ob = new TightlyCoupledA();

        //Directly setting the value of data member "name" of class A, due to tight coupling between the class A and B
        ob.name=null;

        //Direct access of data member "name" of class A, due to tight coupling between two classes
        System.out.println("Name is " + ob.name);
    }
}

public class Coupling {
}


class LooselyCoupledA
{
    private String name;	//data member "name" is declared private to implement loose coupling.


    public String getName()
    {
        if(name!=null)	//Checking a valid access to data member, name
            return name;
        else
            return "not initiaized";
    }

    public void setName(String s)
    {
        if (s==null)	//Checking a valid setting of data member, name
            System.out.println("You can't initialize name to a null");
        else
            name = s;
    }
}


class LooselyCoupledB
{
    public static void main(String... ar)
    {
        //Creating an object of class AA
        LooselyCoupledA ob= new LooselyCoupledA();

        //Calling setter method, as the direct access of "name" is not possible i.e. loose coupling between classes
        ob.setName(null);

        //Calling getter method, as the direct access of "name" is not possible i.e. loose coupling
        System.out.println("Name is " + ob.getName());
    }
}
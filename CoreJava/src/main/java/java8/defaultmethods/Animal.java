package java8.defaultmethods;

import java.util.ArrayList;
import java.util.List;

/**
Simplest answer is to enable the functionality of lambda expression in java. Lambda expression are essentially of type of functional interface. To support lambda expressions seamlessly, all core classes have to be modified. But these core classes like java.util.List are implemented not only in JDK classes, but also in thousands of client code as well. Any incompatible change in core classes will back fire for sure and will not be accepted at all.
Default methods break this deadlock and allow adding support for functional interface in core classes. Let’s see an example. Below is a method which has been added to java.lang.Iterable.
default void forEach(Consumer<? super T> action) {
    Objects.requireNonNull(action);
    for (T t : this) {
        action.accept(t);
    }
}
*/
public class Animal implements Moveable {

	@Override
	public void roar() {
		System.out.println("Child : Roarrrrrrrr");
	}
	
	public void eat() {
		System.out.println("Parent : Eat ");
	}
	public static void main(String[] args) {
		Animal tiger = new Animal();
		tiger.move();
		tiger.roar();
		tiger.eat();
		tiger.sleep();

		
		Moveable move=new Animal();
		move.move();
		move.roar();
		move.sleep();
		//move.eat(); // Uncomment to see *OOPS concepts reference decides the definition to be loaded for an object
		
		List<Animal> list = new ArrayList();
        list.add(new Animal());
        list.add(new Animal());
        list.add(new Animal());
         
        //Iterator code reduced to one line
        list.forEach((Moveable p) -> p.move());
	}
	
	
}
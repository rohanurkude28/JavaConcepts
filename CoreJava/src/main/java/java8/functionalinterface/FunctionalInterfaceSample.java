package java8.functionalinterface;

/** Default and Static methods are allowed since they arent abstract*/
@FunctionalInterface
public interface FunctionalInterfaceSample {
	public void firstWork();

	default void doSomeMoreWork1(){
	//Method body
	}

	static void doSomeMoreWork2(){
	//Method body
	}
}
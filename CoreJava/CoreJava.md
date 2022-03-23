# Core Java Concepts

### JVM ( java virtual machine) architecture

JVM's responsibility is - To load and Execute you application files

![](src/main/resources/JVMArchitectureDiagram.png)

![](src/main/resources/JVMArchitectureDiagramDetailed.png)

- Class Loader - Class Loader is responsible to load .class files related to app and built in by JAVA API
- Runtime Data Areas - Memory Instantiation and Allocation
- Execution Engine - These bytecode is then executed by execution engine for which native calls are made to Host OS.

#### Class Loader Subsystem

![](src/main/resources/ClassLoaderSubSystem.png)

There are three phases in Class Loader

<ul>
  <li> Load </li>
    <ul>
      <li>Bootstrap Class Loader - Responsible for loading Java's internal classes</li>
      <li>Extension Class Loader - Additional classes jre/lib/ext</li>
      <li>Application Class Loader - Load classes from your applications classPath + -cp params</li>
    </ul>
  <li> Link </li>
    <ul>
      <li>Verify - Checks bytecode is compatible with JVM Specification</li>
      <li>Prepare - Memory is allocated to static vars and assign default values</li>
      <li>Resolve - All symbolic references are resolved</li>
    </ul>
  <li> Initialize - Static blocks are executed, and values are assigned to static vars</li>
</ul>	

#### Runtime Data Areas

![](src/main/resources/RuntimeDataArea1.png)
![](src/main/resources/RuntimeDataArea2.png)
<ul>
    <li> Method Area - Metadata corresponding to class is stored, static variables, also knows as PermGen space (64 Mb), after Java 8 PermGen is replaced by Metaspace which has infinite memory (As much as the OS) </li>
    <li> Heap - Object data is stored</li>
    <li> PC Registers - Pointer to next instruction to be executed per thread</li>
    <li> Java Stacks - Stack Frame related to current method execution , will have related stacks of method calls</li>
    <li> Native Method Stacks - Method calling native libs .dll etc </li>
</ul>

#### Execution Engine

![](src/main/resources/ExecutionEngine.png)

<ul>
    <li> Interpreter - Interprets the current instruction in bytecode and figures out what native operation is to be done and using JNI does it</li>
    <li> JIT Compiler - If an instruction is being called a lot of times, and it compiles these set of instruction and executes it without interpreting thus saving time</li>
    <li> Hotspot Profiler - Keeps an eye on the bytecode that are running, grabs different stats and tells JIT compile frequently used instructions  </li>
    <li> GC - Cleans up unused objects, classes etc</li>
</ul>

[More about different GC's](GarbageCollector.md)


### Java Memory Model

- Order of execution - Performance driven done by Compiler, JVM or CPU
- Field Visibility - In presence of concurrency

JMM is a specification which guarantees visibility of fields (AKA happens before) amidst of reordering of instructions. Can be solved using Synchronised, Locks, Concurrent Collections, Thread Operations (Join,Start), Final Fields etc. 

![](src/main/resources/MemoryFootprintDiagram.png)

![](src/main/resources/InstructionVsMemory.png)

Heap Tuning

![](src/main/resources/HeapTuning.png)


### OOPS Concepts

#### Rules of Overriding

Overriding refers to the ability of a subclass to re-implement an instance method inherited from a superclass
- Only inherited methods can be overridden.
- Final and static methods cannot be overridden.
- The overriding method must have same argument list.
- The overriding method must have same return type (or subtype).
- The overriding method must not have more restrictive access modifier.
- The overriding method must not throw new or broader checked exceptions.
- Use the super keyword to invoke the overridden method from a subclass.
- Constructors cannot be overridden.
- Abstract methods must be overridden by the first concrete (non-abstract) subclass.
- A static method in a subclass may hide another static one in a superclass, and that’s called hiding.
- The synchronized/strictfp modifier has no effect on the rules of overriding.

#### Association

##### Composition (HAS-A)

- A composition in Java between two objects associated with each other exists when there is a strong relationship between one class and another.
- Other classes cannot exist without the owner or parent class.
- It is possible to achieve “multiple inheritances”
- Loosely coupled
- Better Unit Testing

##### Aggregation (HAS-A)

- Aggregation is a term which is used to refer one way relationship between two objects.
- Object can live without each other
- Code re-usability
- Loosely coupled
- Better Unit Testing

##### Inheritance (IS-A)

###### Interface

- By default all methods are public and abstract
- Java does allow multiple inheritance between interfaces
- Can have default and static methods, which can call private methods
- From Java 9, private methods can be added to interface in Java, to use private methods to hide details on implementation from classes
- Three Types : Normal, Functional (Can have only one abstract method and many default/static methods), Marker Interface (**No definitions checked by compiler by using instanceof**)

###### Abstract class

- Can have both Abstract as well as non Abstract methods
- Abstract methods can be public or protected
- Private non Abstract methods wont be called as overriding
- Java does not allow a class inherits two or more classes directly

###### Rules of Inheritance

- When a class implements an interface, it has to provide implementation details for all the methods of that interface
- When an abstract class implements an interface, it’s not required to override methods of the super interface. But the first non-abstract class in the inheritance tree must override the methods.
- When a class extends another class, the subclass inherits all the public and protected members of the super class. The default members are inherited only in the same package.
- When an interface extends another interface, the sub interface inherits all the methods declared in the super interface, and it’s free to re-declare the methods or not.
- We can have a class inherits both an interface and a class directly
- We can use the super type when creating a new object of the subtype. **Liskov's Substitution principle**
- The super keyword is used to access members of the super type from the subtype
- Private members are not inherited. Default members are inherited only if both the subclass and super class are in the same package, otherwise default members are not inherited.
- The sub class cannot inherit constructors from its super class.
- Object is the base class of all classes in Java.
- We can use covariant return types while overriding, thus changing method definition.

#### Polymorphism

**Polymorphism means ‘many forms’**
- Can be achieved using overloading, overriding and operator overloading.
- Two Types : Static and Dynamic Polymorphism.

#### Encapsulation

**Encapsulation - ‘information hiding’ or ‘data hiding’.**

- Encapsulation is implemented in Java using interfaces, classes, access modifiers, setters and getters.
- Used cause : Flexibility,Reusability and Maintainability.

Encapsulation vs. Abstraction
- Cant be compared both serves a different purpose
- Abstraction is the process of modeling real things vs Encapsulation is the process of hiding information details and protecting data and behavior of an object.
- Encapsulation is done based on abstraction. Imagine you are building a house. The house is made by bricks. Abstraction is the bricks and encapsulation is the house.

#### Coupling

Coupling refers to the extent to which a class knows about the other class.

There are two types of coupling -
- Tight Coupling(a bad programming design) - **Inheritance**
- Loose Coupling(a good programming design) - **Composition, Encapsulation**

#### Cohesion

Cohesion refers to the extent to which a class is defined to do a specific specialized task. **Single responsibility Principle.**

There are two types of cohesion -
- Low cohesion(a bad programming design)
- High Cohesion(a good programming design)

#### Upcasting vs Downcasting

- Upcasting (Generalization or Widening) is casting to a parent type. eg: cast from a Dog to an Animal, Animal anim = (Animal) dog;
- Downcasting When we want to cast a Super class to Sub class. eg: Cat cat = (Cat) anim;

#### Exceptions

##### Hierarchy

![](src/main/resources/ExceptionsHierarchy.png)

- Error indicates "serious problems that a reasonable application should not try to catch.”
- Exceptions indicate “conditions that a reasonable application might want to catch.”

##### Checked (Compile-time) vs Unchecked Exceptions (Runtime)

- Exceptions that can occur at compile-time are called checked exceptions since they need to be explicitly checked and handled in code. Classes that directly inherit Throwable - except RuntimeException
- Unchecked exceptions can be thrown "at any time" (i.e. run-time). Therefore, methods don't have to explicitly catch or throw unchecked exceptions. Classes that inherit RuntimeException


##### Exception Handling with Method Overriding

- If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
- If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.

##### Try with Resource

- Class needs to implement AutoCloseable interface. Overridden close method.
- Can have one or multiple resource (semicolon separated) (Closed in order of declaration)

##### Catch Multiple Exceptions

- Exceptions belong to the same class hierarchy, you can simply catch that base exception type.
- Cannot catch both ExceptionA and ExceptionB in the same block if ExceptionB is inherited, either directly or indirectly. Compiler time issue
- The exception variable declared within multi-catch block is implicitly final . Therefore, we can not assign the variable to different value within the catch block.


#### Core Java

- Final Value can be initialised by 3 ways : constructor, instance block, direct
- Order of Execution -  Static Block (Called once), Instance Block, Default Constructor/Parameterised Constructor, Methods
- Object Creation ways: 
<ol>
    <li> New Keyword</li>
    <li> Cloning - Implement cloneable and clone from existing object</li>
    <li> Deserialization - Implement Serializable, Serializable an object and Deserializable it  </li>
    <li> Reflection - Class.forname</li>
    <li> Reflection - constructor.newInstance()</li>
</ol>

- Design Immutable class
<ol>
    <li> Declare the class as final so it can’t be extended. </li>
    <li> Make all fields private so that direct access is not allowed. </li>
    <li> Don’t provide setter methods for variables. </li>
    <li> Initialize all the fields via a constructor performing deep copy. </li>
    <li> Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference. </li>
</ol>
- 

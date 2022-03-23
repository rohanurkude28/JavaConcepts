package java8.optional;

import java.util.Optional;

public class OptionalSample {
public static void main(String[] args) {
	
	/* Optional.of() to create optional with default non-null value */
	Optional<Integer> canBeEmpty1 = Optional.of(5);		//
	System.out.println(canBeEmpty1.isPresent());                    // returns true
	System.out.println(canBeEmpty1.get());                          // returns 5
	
	/*Use Optional.empty() to create empty optional. */
	Optional<Integer> canBeEmpty2 = Optional.empty();	//Create Empty Object
	System.out.println(canBeEmpty2.isPresent());                    // returns false
	//System.out.println(canBeEmpty2.get());   			//Error NoSuchElementException
	
	/*Optional.ofNullable() to create an Optional object that may hold a null value*/
	Optional<Integer> possible = Optional.ofNullable(null);
	System.out.println(possible.isPresent());                    // returns false
	//System.out.println(possible.get());				//Error NoSuchElementException
	//or
	Optional<Integer> possible2 = Optional.ofNullable(5);
	System.out.println(possible2.isPresent());                    // returns true
	System.out.println(possible2.get());
	
	/*Do something If Optional value is present*/
	Optional<Integer> possible3 = Optional.of(5);
	possible3.ifPresent(System.out::println);
	//or
	if(possible3.isPresent()){
	    System.out.println(possible3.get());
	}
	
	/*Default/absent values and actions*/
	
	//Assume this value has returned from a method
	Optional<Company> companyOptional = Optional.empty();
	System.out.println(companyOptional); 
	
	//Now check optional; if value is present then return it,
	//else create a new Company object and retur it
	Company company = companyOptional.orElse(new Company());
	System.out.println(company);
	
	//OR you can throw an exception as well
	/*Company company2 = companyOptional.orElseThrow(IllegalStateException::new);
	System.out.println(company2);*/
	
	/*Rejecting certain values using the filter method*/
	Optional<Company> companyOptional2 = Optional.empty();
	companyOptional2.filter(department -> "Finance".equals(department.getDepartment())).ifPresent(x -> System.out.println("Finance is present"));

	/*default no-args constructor is define private, so you can’t create an instance of Optional except of,ofNullable,empty*/
	                    
	
}

}
package java_8_tutorials_point;

import java.util.Optional;

public class Optional8 {

	public static void main(String[] args) {

		Integer value1 = null;
//		Integer value1 = new Integer(11);

		Integer value2 = new Integer(10);
		
		//Optional.ofNullable - allows passed parameter to be null.
		Optional<Integer> a = Optional.ofNullable(value1);
		//Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> b = Optional.of(value2);
		
		
		System.out.println(sum(a,b));
	}


	private static int sum(Optional<Integer> a, Optional<Integer> b) {

		//Optional.isPresent - checks the value is present or not
		
		System .out.println("First param eter is present: " + a.isPresent());
		System .out.println("Second param eter is present: " + b.isPresent());
		
		
		//Optional.orElse - returns the value if present otherwise returns
		//the default value passed.
		Integer value1 = a.orElse(10);
		
		//Exception in thread "main" java.util.NoSuchElementException: No value present
		//if a has no value - a is null which allowed through ofNullable.
		//return a.get()+b.get();
		
		//Optional.get - gets the value, value should be present
		return value1 +b.get();
	}

}

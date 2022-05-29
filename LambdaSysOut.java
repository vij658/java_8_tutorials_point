package java_8_tutorials_point;

import java.util.*;

public class LambdaSysOut {

	@FunctionalInterface
	interface GreetingService {
		void sayMessage(String message);
	}

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 2, 3, 4);

		// enhanced For
		for (int i : intList) {
			System.out.println(i);
		}
//Static methods
		// Instance methods
		// Constructors using new operator (TreeSet::new)
		// Java 8 - method reference
		intList.forEach(x -> System.out.println(x));
		//Here we have passed System.out::println method as a static method reference.
		intList.forEach(System.out::println);
		// You don't actually need the name x in order to invoke println for
		// each of the elements.
		// That's where the method reference is helpful - the :: operator
		// denotes you will be invoking the println method with a parameter,
		// which name you don't specify explicitly:

		// Functional programming - Java 8

		// 1. interface - one method
		// 2. lambda short form for implementation
		// 3. passing a reference for a method.

		// parameter -> expression body

		// whatever is after -> is the impl with parenthesis, message is the
		// reference variable.
		GreetingService greetService1 = (message) -> System.out.println("Hello " + message);
		greetService1.sayMessage("tst1");

		// without parenthesis
		GreetingService greetService2 = message -> System.out.println("Hello " + message);
		greetService2.sayMessage("tst2");

		// with all brackets/parenthesis
		GreetingService greetService3 = (message) -> {
			System.out.println("Hello " + message);
		};
		greetService3.sayMessage("tst2");

		List names = new ArrayList();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");
		names.forEach(System.out::println);

	}

}

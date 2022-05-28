package java_8_tutorials_point;

import java.util.ArrayList;
import java.util.List;

public class PrintlnEx {

	interface GreetingService {
		void sayMessage(String message);
	}

	public static void main(String[] args) {
		//Functional programming - Java 8
		
		//1. interface - one method 
		//2. lambda short form for implementation 
		//3. passing a refernce for a method.

		// parameter -> expression body

		// whatever is after -> is the impl with parenthesis, message is the reference variable.
		GreetingService greetService1 = message -> System.out.println("Hello " + message);
		 greetService1.sayMessage("tst");

		// without parenthesis
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);
		
		List names = new ArrayList();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");
		names.forEach(System.out::println);

	}
}

package java_8_tutorials_point;

import java.util.Arrays;
import java.util.List;

public class Lambda {
	
	interface MathOperation {
		int operation(int a, int b);
		default String operation1(String a, String b){return a;};
		default String operation2(String a, String b){return a;};
		default String operation4(String a, String b){return a;};
		}
	
	
	interface MathOperation1 {
		void operation1();
		}

	public static int operate(int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a, b);
		}
	public static void main(String[] args) {
		
		Lambda lambda = new Lambda();
		
		// parameter -> expression body
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4);
// enhanced For
				for (int i : intList) {System.out.print(i);}
// Java 8 - method reference 
				//parenthesis can be avoided if there is only one parameter.
				intList.forEach(x -> System.out.print(x));
				intList.forEach(System.out::print);
		
//1	With Type Declaration
		MathOperation addition00 = (int a, int b) -> { System.out.println(a+b); return a + b;} ;
//		 addition00 = (int a, int b) -> { return a + b;} ;

		Lambda.operate(5, 4,addition00);

// 2 Without Type Declaration
		MathOperation subtraction = (a, b) -> a - b;
		Lambda.operate(5, 4,subtraction);
// 3 with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> { return a * b; };
		Lambda.operate(5, 4,multiplication);
//4. without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;
		Lambda.operate(5, 4,division);
		//4. without return statement and without curly braces
				MathOperation division1 = (a, b) -> a / b;
				Lambda.operate(5, 4,division);
		
				System.out.println("10 + 5 = " + lambda.operate(10, 5, addition00));
				System.out.println("10 - 5 = " + lambda.operate(10, 5, subtraction));
				System.out.println("10 x 5 = " + lambda.operate(10, 5, multiplication));
				System.out.println("10 / 5 = " + lambda.operate(10, 5, division));		
				
		
//with return statement along with curly braces
		MathOperation addition0 = (int a, int b) -> { return a + b; };
		Lambda.operate(5, 4,addition0);
		MathOperation addition5 = (a,  b) -> a + b;
		MathOperation1 refe = () -> {System.out.println("fdssdfs");};
		refe.operation1();
//without curly braces  along with curly braces
		MathOperation addition1 = (int a, int b) -> a + b; ;
//3 with type declaration
		MathOperation addition2 = (int a, int b) -> a + b;		
//4 with out type declaration 3. JAVA 8 ─ LAMBDA EXPRESSIONS11
		MathOperation addition3 = (a, b) -> a + b;
		
		//+ - int is addtion 
		//+ - string is concatetion.
		//+ - single interface impl, de
	}
}

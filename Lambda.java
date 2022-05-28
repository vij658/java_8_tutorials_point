package java_8_tutorials_point;

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
//1			
		System.out.println("1. test");
//2 parameter -> expression body
		//with parenthesis
		message -> System.out.println("Hello " + message);
//		GreetingService greetService1 = message -> System.out.println("Hello " + message);
		
		
//with return statement along with curly braces
		MathOperation addition0 = (int a, int b) -> { return a + b; };
		
		
		Lambda.operate(5, 4,addition0);
		
		
		
		
		MathOperation addition5 = (a,  b) -> a + b;

		MathOperation1 refe = () -> {System.out.println("fdssdfs");};
		
		
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

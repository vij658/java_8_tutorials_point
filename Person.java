package java_8_tutorials_point;

public class Person {
	Head head;
	Torso torso;
	Limb limb;
	
	
	
	static int run(int speed){
		System.out.println("Person is running at" + speed + " km");

		return speed;
	}
	public static void main(String[] args) {
		Person.run(5);
	}
}

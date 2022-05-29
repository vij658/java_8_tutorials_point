package java_8_tutorials_point;

import java.util.Random;

public class RandomPrint {

	public static void main(String[] args) {
		Random random = new Random ();
		random.ints().limit(10).forEach(System.out::println);
		
	}

}

package java_8_tutorials_point;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams8 {
	
	public static void main(String a[]){
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(String -> !String.isEmpty()).collect(Collectors.toList());
		
		
		Random random = new Random ();
		random.ints().limit(10).forEach(System.out::println);
		
		//stream - 10 - parallel 
		
		//stream - is an iterator
		//for each
		//map -> each element in the list
		//filter -> condition or 
		//collection -> end reference. 
		
	}

}

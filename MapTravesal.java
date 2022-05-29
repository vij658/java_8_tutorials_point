package java_8_tutorials_point;

import java.util.HashMap;
import java.util.Map;

public class MapTravesal {

	public static void main(String[] args) {
		//Cant use primitive type. this will fail compiling.
//		Map<int,String> strMap = new HashMap<int, String>();

		
		Map<Integer, String> strMap1 = new HashMap<Integer, String>();
		strMap1.put(1, "one");
		strMap1.put(2, "Two");
		strMap1.put(-1, "minus one");
		
		//https://stackabuse.com/guide-to-java-streams-foreach-with-examples/
		
		
//		for(Key k:strMap1.keySet()) {
//			
//		}
	}

}

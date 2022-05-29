package java_8_tutorials_point.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort8 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,6,7,0,-1,-9,19,13,11);
		List<String> strList = Arrays.asList("de","asd","zzz","pdd","bbb");

		Collections.sort(list);

		Collections.sort(strList);
		strList.forEach(System.out::print);
		System.out.println();
		list.forEach(x->System.out.print(x));
		System.out.println();

				//Java 8
		Collections.sort(strList, (s1,s2 ) -> (s1).compareTo(s2));
		System.out.println("strList" + strList);
		System.out.println("intList" + list);

	}

}

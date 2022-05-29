package java_8_tutorials_point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorJava8 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Abb");
		list1.add("zzz");
		list1.add("xzz");
		list1.add("rzz");
		list1.add("fzz");

		List<String> list2 = new ArrayList<String>();
		list2.add("czz");
		list2.add("bzz");
		list2.add("xzz");
		list2.add("ozz");
		list2.add("1zz");
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(10);
		intList.add(-1);
		intList.add(6);

		
		
		//Java 7
		Collections.sort  (list1, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		System.out.println("list1" + list1);
		
		//Java 8
		Collections.sort(list2, (s1,s2 ) -> (s1).compareTo(s2));
		
		System.out.println("list2" + list2);
		
		//Java 8 with custom imple
		Collections.sort(intList, (i1,i2) -> 
		{ 
		if(i1>i2) return 1;
		else if (i1<i2) return -1;
		else return 0;
		});
		System.out.println("int list " + intList);
		
		//Fail - generics 
//		List ret = sortWithGenerics(intList);

	}

	
	//FAILED - you need string, Integer or double to use compareTo
	
//	private static <T> List<T> sortWithGenerics(List<T> intList) {
//		// TODO Auto-generated method stub
//		return Collections.sort(intList, new Comparator<T>(){
//			@Override
//			public int compare(T o1, T o2){
//				return o1
//			}
//		});
//	}
	
	

}




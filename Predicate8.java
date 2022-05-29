package java_8_tutorials_point;

import java.util.function.Predicate;
import java.util.*;

public class Predicate8 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,6,7,0,-1,-9,19,13,11,14);
		List<String> strList = Arrays.asList("de","asd","zzz","pdd","bbb","ser");
		
		Collections.sort(list);

		Collections.sort(strList);
		strList.forEach(System.out::println);
		
		//predicate print all 
		predicateTest(list, n->true);
		
		//greater than 3
		predicateTestInt(list, n-> n > 3);
		
		//print even numbers
		System.out.println("evens");
		predicateTest(list, n->n%2==0);
		
		//print names with s
		System.out.println("print names with s");
		predicateTest(strList, s->s.startsWith("s"));
		
		
		
		List<Person> liPerson = new ArrayList<>();
		liPerson.add(new Person(4,"ere"));
		liPerson.add(new Person(6,"eeere"));
		liPerson.add(new Person(1,"aaere"));
		liPerson.add(new Person(-4,"gggere"));
		
//		Collections.sort(liPerson, (p1,p2)-> (p1).compareTo(p2));
//		Collections.sort(strList, (s1,s2 ) -> (s1).compareTo(s2));
		
		
		
		Collections.sort(liPerson, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				if(p1.getId()>p2.getId()) return 1;
				else if (p1.getId()<p2.getId()) return -1;
				else return 0;
			}
		});

		System.out.println("liPerson " +liPerson);
//		liPerson.foreach(x-> {});
//		System.out.println(x.getId() +  " " + x.getName();
		
		for(Person x : liPerson) {
			System.out.println(x.getId() +  " " + x.getName());
		}

	}

	public static <T> void predicateTest(List<T> list, Predicate<T> p){
		System.out.println("size " +list.size());
		list.forEach(x->{if (p.test(x)){System.out.println(x);}});
	}
	
	public static <T> void predicateTestInt(List<Integer> list, Predicate<Integer> p){
		System.out.println("size " +list.size());
		list.forEach(x->{if (p.test(x)){System.out.println(x);}});
	}
	
}

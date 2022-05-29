package java_8_tutorials_point;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams8 {

	public static void main(String a[]) {

		// stream - is an iterator
		// for each
		// map -> each element in the list
		// filter -> condition or
		// collection -> end reference.

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		// just collect
		List<String> flitered = strings.stream().collect(Collectors.toList());
		List<String> empty = strings.stream().filter(x -> x.isEmpty()).collect(Collectors.toList());
		List<String> notEmpty = strings.stream().filter(String -> !String.isEmpty()).collect(Collectors.toList());
		
		// stream - 10 - parallel

		List<String> parallelStr = strings.parallelStream().filter(x->!x.isEmpty()).collect(Collectors.toList());
		System.out.println("flitered " + flitered);
		System.out.println(" empty " + empty.size());
		System.out.println(" notEmpty " + notEmpty.size());
		
		System.out.println(" parallelStr " + parallelStr);



		//random forEach
		Random intRand = new Random();
		intRand.ints().limit(10).forEach(System.out::println);
		
		intRand.doubles().limit((long) 10.0).forEach(System.out::println);
		
		//map forEach
		List<Integer> uniqSquares = Arrays.asList(2,4,1,-1,8,9,0,20,-4);
		uniqSquares.stream().map(x->x*x).forEach(System.out::println);
		
		//collect(Collectors.toList());
		uniqSquares.forEach(System.out::println);
		
		//get list of unique squares
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> squaresList = numbers.stream ().map( i ->i* i).distinct().collect(Collectors.toList());
		System.out.println("squaresList ");
		squaresList.forEach(System.out::println);
		
		//count
		System.out.println("count "+ strings.stream().filter(x->!x.isEmpty()).count());
		
		//sorted
		strings.parallelStream().filter(x->x.contains("a")).sorted().forEach(System.out::println);
		
		//String joining - merge
		String merged = numbers.stream().map(x->x*x).map(x->x.toString()).collect(Collectors.joining(", "));
		
		System.out.println("merged "+merged	);
		
		IntSummaryStatistics intSum = numbers.stream().mapToInt((x)->x).summaryStatistics();
		
		//stats IntSummaryStatistics{count=7, sum=25, min=2, average=3.571429, max=7}
		System.out.println("stats "+ intSum);
		
		
		IntStream stream = IntStream.range(3, 8);

		// Creating a Stream of Strings
		// Using IntStream mapToObj(IntFunction mapper)
		// to store binary representation of
		// elements in IntStream
		Stream<String> stream1 = stream.mapToObj(num -> Integer.toBinaryString(num));

		// Displaying an object-valued Stream
		// consisting of the results of
		// applying the given function.
		stream1.forEach(System.out::println);
		
		
		//test for each
		IntStream teststream = IntStream.range(-1, 8);
		teststream.forEach((x)-> {
			x =x+10; 
			System.out.print(" " +x);});
	}
}

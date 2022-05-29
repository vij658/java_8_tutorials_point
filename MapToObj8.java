package java_8_tutorials_point;

import java.math.BigInteger;
//Java code for IntStream mapToObj
//(IntFunction mapper)
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class MapToObj8 {

	// Driver code
	public static void main(String[] args) {
		// Creating an IntStream
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

		//Printing actual string representation of int
		
		//
		IntStream testActStr = IntStream.of(0,5,9,-1,5);
		Stream<String> streamActualInt = testActStr.mapToObj(num -> Integer.toString(num));
		System.out.println("actual int as string");

		streamActualInt.forEach(System.out::println);
		
		//cant do second time on a stream, this will fail with steam has already been operated upon or closed.
		
//		System.out.println(streamActualInt.collect(Collectors.toList()));


		IntStream newStream = IntStream.of(2,3,9,7,6,5);
		
		// Creating a Stream
        // Using IntStream mapToObj(IntFunction mapper)
        Stream<BigInteger> stream2 = newStream
                                         .mapToObj(BigInteger::valueOf);
  
        // Displaying an object-valued Stream
        // consisting of the results of
        // applying the given function.
        stream2.forEach(num -> System.out.println(num.add(BigInteger.TEN)));
		
	}
}

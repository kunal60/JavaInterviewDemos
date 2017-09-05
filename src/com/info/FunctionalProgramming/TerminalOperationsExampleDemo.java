//Part 4
package com.info.FunctionalProgramming;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class TerminalOperationsExampleDemo {

	// Example: reduce, forEach ,collect

	// reduce is used to cumulate elements
	@Test
	public void sumofoddNumbers_FunctionalProgrammingExample() {
		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
		int sum = numbers.stream().filter(number -> isOddNumber(number)).reduce(0, Integer::sum);
		// reduce takes the values and combine them into a single value
		assertEquals(11, sum);
	}

	// forEach is used to create a side effect.Print to Output.Store to
	// database.
	@Test
	public void streamExample_Filter() {
		Arrays.stream(new String[] { "Ram", "Robert", "Rahim" }).filter(s -> s.startsWith("Ro"))
				.map(String::toLowerCase).sorted().forEach(System.out::println);

	}

	// collect is used to group elements to a collection
	// The output of terminal operator can also be a list
	@Test
	public void streamExample_Collect() {
		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
		List<Integer> oddnumbers = numbers.stream().filter(number -> isOddNumber(number)).collect(Collectors.toList());
		System.out.println(oddnumbers);
		// [13,7]

	}

	static boolean isOddNumber(int number) {
		return number % 2 != 0;
	}

}

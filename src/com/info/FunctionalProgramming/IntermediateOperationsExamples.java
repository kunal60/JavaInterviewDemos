//Part 3

package com.info.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class IntermediateOperationsExamples {

	// Example: map, filter, distinct,sorted

	// Distinct Example
	@Test
	public void streamExample_Distinct() {
		List<Integer> numbers = Arrays.asList(1, 1, 2, 6, 2, 3);
		numbers.stream().distinct().forEach(System.out::print);
		// 1263

	}

	// Sorted Example
	@Test
	public void streamExample_Sorted() {
		List<Integer> numbers = Arrays.asList(1, 1, 2, 6, 2, 3);
		numbers.stream().distinct().forEach(System.out::print);
		// 112236

	}

	// Filter Example
	@Test
	public void streamExample_Filter() {
		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
		numbers.stream().filter(number -> isOdd(number)).forEach(System.out::print);
		// 137
	}

	static boolean isOdd(int number) {
		return number % 2 != 0;
	}

}

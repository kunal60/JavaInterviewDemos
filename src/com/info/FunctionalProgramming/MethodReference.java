//Part 5
package com.info.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class MethodReference {

	@Test
	public void streamExample_Collect() {
		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
		List<Integer> oddnumbers = numbers.stream().filter(MethodReference::isOddNumber).collect(Collectors.toList());
		// Here MethodReference::isOddNumber is a method reference.
		// Syntax: ClassName::staticMethod
		System.out.println(oddnumbers);
	}

	static boolean isOddNumber(int number) {
		return number % 2 != 0;
	}

}

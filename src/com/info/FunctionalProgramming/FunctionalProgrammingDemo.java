package com.info.FunctionalProgramming;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FunctionalProgrammingDemo {

	@Test // Import junit 4 into project class path
	// This function is normal functional without Functional Programming
	public void sumofoddNumbers_Usual() {
		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
		int sum = 0;
		for (Integer number : numbers) {
			if (number % 2 != 0)
				sum = sum + number;// The state of sum keeps changing
		}
		assertEquals(11, sum);
	}

	@Test
	public void sumofoddNumbers_FunctionalProgrammingExample() {
		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
		int sum = numbers.stream().filter(number -> isOddNumber(number)).reduce(0, Integer::sum);

		assertEquals(11, sum);
	}

	static boolean isOddNumber(int number) {
		return number % 2 != 0;
	}

}

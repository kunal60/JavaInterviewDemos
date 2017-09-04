//Part 2
package com.info.FunctionalProgramming;

import java.util.Arrays;

public class StreamExample {

	public static void main(String[] args) {
		Arrays.stream(new String[] { "Ram", "Robert", "Rahim" }).filter(s -> s.startsWith("Ro"))
		.map(String::toLowerCase).sorted().forEach(System.out::println);
	}
	

}

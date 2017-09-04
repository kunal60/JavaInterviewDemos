//Part 2
package com.info.FunctionalProgramming;

import java.util.Arrays;

public class StreamExample {

	public static void main(String[] args) {

		// This code is basically creating a stream from an Array

		Arrays.stream(new String[] { "Ram", "Robert", "Rahim" }).filter(s -> s.startsWith("Ro"))
				.map(String::toLowerCase).sorted().forEach(System.out::println);

		// .filter(s -> s.startsWith("Ro")) means --take with a String 's'. Is
		// 's' starting with 'Ro'. This expression is called Lambda
		// expression.What we are defining here is actually a function. What we
		// are saying is accept an input 's' and see if that string is starting
		// with 'Ro'

		// In map(String::toLowerCase),we are taking above value and we are
		// mapping it to a String tolowercase. toLowerCase is one of the
		// functions in String. Its basically String.tolowerCase and you pass an
		// 's'

		// Instead of using this kind of style .map(String::toLowerCase), i
		// could have written that in Lambda expression style as well
		// .map(s-> String.toLowerCase(s)).Here i am saying take an input of 's'
		// and return me a String.toLowerCase of 's'

		// .map(String::toLowerCase) -- What is does is it take whatever
		// parameter is passed in,executes this method and returns that value
		// back.
		// This is called method reference.

		// Here filter, map and sorted are intermediate operations.
		// .forEach is terminal operation
	}

}

//Part 6
package com.info.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LambdaExpressions {

	@Test
	public void sumofoddNumbers_FunctionalProgrammingExample() {
		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
		numbers.stream().filter((number) -> (number % 2 != 0)).forEach((number) -> System.out.print(number));
		// ((number) -> (number%2!=0)) is a lambda expression.You take number as
		// input and return back (number%2!=0)
		// This is another example of lambda expression. You are taking number
		// as input and you are printing it out to the output
		// You can change lambda expressions with method references here

	}

	// filter()
	// If you open filter();
	// public abstract Stream<T> filter(Predicate<? super T> paramPredicate);
	// This filter actually accepts a predicate. A predicate is something which
	// is either true or false.It takes an inputs and returns whether something
	// is true or false.
	// Lets look at predicate
	// @FunctionalInterface
	// public abstract interface java.util.function.Predicate {}
	// You can see that this Predicate is annotated with something called as
	// Functional Interface.
	// Basically a predicate a something which takes one input and returns
	// whether its true or false. This particular interface has only one
	// function defined in here
	// Functional interface is something which has only one method declared in
	// there.

	// reduce()
	// public abstract Optional<T> reduce(BinaryOperator<T>
	// paramBinaryOperator);
	// reduce accepts a binary operator as one of the things. BinaryOperator is
	// again a functional interface.Howere if you look at the binary
	// operator, it extends BiFunction
	// @FunctionalInterface
	// public abstract BinaryOperator extends BiFunction {
	// R apply(T t , U u)}
	// apply is an important method.It accepts two objects as input & you can
	// return any value as output.
	// .reduce(0,Integer::sum)

	// .forEach()
	// public abstract void forEach(Consumer<? super T> paramConsumer);
	// for each uses a Consumer. Consumer is another functional interface
	// @FunctionalInterface
	// public abstract interface Consumer {}
	// The Consumer accepts an object as an input, but it doesn't return
	// anything
	// back.It basically consumes it. It either prints it into the output or
	// store things into the database or things like that.

	// If you look at all of the above functional interfaces, they have only one
	// method declared.The lambda expression is defining that method.

	// Functional Interface
	// Has only one method!
	// Predicate - object -> boolean
	// Consumer - objects -> void
	// Function -> object -> some other object
	// BiFunction - Two Objects -> Some other object

}

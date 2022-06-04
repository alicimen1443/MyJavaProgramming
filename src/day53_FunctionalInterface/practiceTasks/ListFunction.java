package day53_FunctionalInterface.practiceTasks;

import java.util.List;

@FunctionalInterface
public interface ListFunction<T,R> {

    R apply(List<T> list );




}
/*
1. Create a functional interface named ListFunction that contains the following abstract method:

		R apply(List<T>  list);

	Use ListFunction functional interface to:
		1.1 Create a function that can return the maximum number from a List of Integer

		1.2 Create a function that can return the minimum number from a list of Integer

		1.3 Create a function that can return the longest String from a List of String

		1.4 Create a function that can return the shortest String from a List of String

		1.5 Create a function that can convert List of integer to int array

		1.6 Create a function that can convert List of double to double array

 */
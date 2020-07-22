package com.epam.lambdas_and_streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AverageOfList {
	public static void main(String[] args) {
		IntStream stream = IntStream.of(10,49,56,1,89);

		OptionalDouble averageOfIntegers = stream.average();
		if (averageOfIntegers.isPresent()) { 
            System.out.println("Average of given integers : " + averageOfIntegers.getAsDouble()); 
        } 
        else { 
            System.out.println("No element exist"); 
        } 
	}

}
		
		
		  


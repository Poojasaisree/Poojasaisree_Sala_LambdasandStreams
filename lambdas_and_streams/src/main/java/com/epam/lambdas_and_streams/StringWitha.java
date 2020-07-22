package com.epam.lambdas_and_streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringWitha { 

	public static void main(String args[]) 
	{ 

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] words = input.split(" ");
		List<String> list = Arrays.asList(words);
		

		Predicate<String> predicate = new Predicate<String>() { 

            public boolean test(String s) 
            { 

                return s.startsWith("a") && s.length() == 3; 
            } 
        };

		System.out.println("List with items starting with a: "); 
		list = list.stream()
			.filter(predicate)
			.collect(Collectors.toList());
		System.out.print(list);
		
		
	} 
}

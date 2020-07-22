package com.epam.lambdas_and_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindPalindromes {
	public static List filterList(List<String> list) {
		System.out.println("List of palindrome strings: ");
		List palindromes = new ArrayList<>();
		 Predicate<String> predicate =  CheckForPalindrome::check;  
		for(String str : list) {
			if(predicate.test(str)) {
				palindromes.add(str);
			}
		}
		return palindromes;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list of strings: ");
		String input = sc.nextLine();
		String[] words = input.split(" ");
		List<String> list = Arrays.asList(words);
		List palindromeList = FindPalindromes.filterList(list);
		System.out.println(palindromeList);
		

	}


}

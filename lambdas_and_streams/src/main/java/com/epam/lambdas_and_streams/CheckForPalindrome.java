package com.epam.lambdas_and_streams;

public class CheckForPalindrome {
	public static boolean check(String string) {
		StringBuilder temporary = new StringBuilder();
		for (char ch : string.toCharArray()) {
                temporary.append(ch);
        }
        String forwardString = temporary.toString();
        String backwardString = temporary.reverse().toString();
        
		return forwardString.equals(backwardString);
		
	}

}

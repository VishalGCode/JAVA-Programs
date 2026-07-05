package stringDemo;

public class StringMethods {
	public static void main(String [] args)
	{
		String s1="welcome";
		String s2="WELcome";
		String s3 = "me";
		String s4 = "w";
		System.out.println(s1.charAt(2));
		System.out.println(s1.compareTo(s2)); // compares two strings lexicographically- means from starting one
		System.out.println(s1.compareToIgnoreCase(s2)); // return type is boolean 
		System.out.println(s1.endsWith(s3)); // return type is boolean 
		System.out.println(s1.indexOf('o',3));// 3 signifies after which index we want to find.
		System.out.println(s1.length());
		System.out.println(s1.startsWith(s4));
		System.out.println(s1.replace('e', 'i'));
		System.out.println(s1.trim());
		System.out.println(s1.isEmpty());
		System.out.println(s1.toUpperCase());
	}

}

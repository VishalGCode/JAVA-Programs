package wrapperDemo;
/*Wrapper classes are provided in java for each corresponding primitive data type
 * like int, float, etc.
 * these classes uphold states behavior of that data type
 * primitive data type            wrapper class
 * int                             Integer 
 * float                           Float
 * long                            Long 
 * double                          Double
 * boolean                         Boolean
 * char                            Character 
 * Auto boxing and unboxing
 * */

public class WrapperClassDemo {
	int a=4;
	@SuppressWarnings("removal")
	Integer i1=new Integer(4); //After version 9 Integer Constructor is removed 
	Integer i2=9;
	/*The Integer class wraps a value of the primitive type int in an object. 
	 *An object of type Integer contains a single field whose type is int. 
	 *this class provides several methods for converting an int to a String and a String to an int, 
	 *as well as other constants and methods useful when dealing with an int.
	 *an int to a string a string to an int 
	 *as well as other constant and methods useful when dealing with an int.
*/
	


public static void main(String[] args) {
	WrapperClassDemo wd=new WrapperClassDemo();
	System.out.println(wd.a);
	System.out.println(wd.i1);
	System.out.println(wd.i2);
	int b=9;
	Integer i3=b;
	Integer i4=Integer.valueOf(b);
	System.out.println(i3+""+i4);
	
}
}
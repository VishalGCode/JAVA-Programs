//package collectionDemo;
//
//import java.util.*;
//public class HashSetDemo {
//	public static void main(String [] args)
//	{
//		HashSet hs = new HashSet();
//		hs.add("B");
//		hs.add("A");
//		hs.add("D");
//		hs.add("E");
//		hs.add("C");
//		hs.add("F");
//		System.out.println(hs);
//		// Output: [A, B, C, D, E, F] Sorted on basis of hashcode.
//	}
//
//}

package collectionDemo;

import java.util.*;
public class HashSetDemo {
	public static void main(String [] args)
	{
		HashSet<String> hs = new HashSet<>();
		hs.add("tom");
		hs.add("tam");
		hs.add("tim");
		hs.add("timtim");
		hs.add("tommy");
		System.out.println(hs);
		// Output: [tam, tom, tommy, tim, timtim] Sorted on basis of hashcode in lexicographically order
		// not aaccording to exact yhalphabetical order
	}

}

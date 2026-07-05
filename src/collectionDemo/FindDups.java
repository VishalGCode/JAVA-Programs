package collectionDemo;

import java.util.*;
public class FindDups {
	public static void main(String[] args)
	{
		Set<String> uniques=new HashSet<String>();
		Set<String> dups=new HashSet<String>();
		for(String a:args)
		{
			if(!uniques.add(a))// if unable to add in uniques then add in uniques.
				dups.add(a);
		}
		uniques.removeAll(dups);
		System.out.println("Unique Words : "+ uniques);
		System.out.println("Duplicate Words: "+dups);
	}

}

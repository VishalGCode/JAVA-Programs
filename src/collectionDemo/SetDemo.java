package collectionDemo;

import java.util.*;

public class SetDemo {
	public static void main(String [] arr)
	{
		Set<String> s1=new HashSet<String>();
		for(String str:arr)
		{
			s1.add(str);
		}
		System.out.println(s1.size() +"distinct words");
		System.out.println(s1);
	}

}

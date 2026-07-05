package collectionDemo;

import java.util.*;

public class ArrayListToArray {
	public static void main(String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		//a1.add(new Integer(4));
		//The constructor Integer(int) has been deprecated since version 9 and marked for removal
		System.out.println("Contents of a1 : "+a1);
		
		Object ia[]=a1.toArray();
		int sum=0;
		for(int i=0;i<ia.length;i++)
		{
			sum+=((Integer)ia[i]).intValue();
		}
		System.out.println("Sum is : "+sum);
		
	
	}

}

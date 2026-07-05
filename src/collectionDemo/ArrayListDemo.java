package collectionDemo;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args)
	{
		/*object o1=new ArrayList<String>();
		o1 can hold all types of objects
		List l1=new ArrayList<String>();// it can hold linked lists too
		base type of reference is good as if the object is killed then reference variable lasts till end.
		ArrayList<String> l2=new ArrayList<String>();// it cannot hold linedlist
		*/
		List<String> l1=new ArrayList<String>();
		System.out.println("Initial size of l1 is : "+ l1.size());
		l1.add("A");
		l1.add("M");
		l1.add("B");
		System.out.println("New Size of l1 is : "+ l1.size());
		System.out.println("l1 contains : "+l1);
		l1.add(2,"k");
		System.out.println("Now l1 contains : "+l1);
		//l1.add(l1);
		//System.out.println("after adding l1, l1 contains : "+l1);
		// o/p : l1 contains : [A, M, k, B, (this Collection)]
		// we can't give object reference using this keyword
		//l1.addAll(l1);
		//System.out.println("Using addAll, Now l1 contains : "+l1);
		List<String> l2=new ArrayList<String>();
		//l2.add(l1);
		//System.out.println("l2 contains : "+l2);
		// creates list inside list
		l2.addAll(l1);
		System.out.println("Now l2 contains : "+l2);
		
	}

}

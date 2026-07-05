package collectionDemo;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String [] args)
	{
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("F");
		l1.add("B");
		l1.add("D");
		l1.add("E");
		l1.add("C");
		l1.addLast("Z");
		l1.addFirst("A");
		l1.add("A2");
		System.out.println("Original Contents of l1 : "+l1);
		l1.remove("F");
		l1.remove(2);
		System.out.println("Contents of l1 after deletion : "+l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println("C=After deletion of first and last element : "+l1);
		Object val=l1.get(2);
		l1.set(2, (String)val+"changed");
		System.out.println("l1 after change : "+l1);
		
	}

}

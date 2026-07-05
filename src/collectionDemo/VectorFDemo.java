package collectionDemo;

import java.util.Vector;

public class VectorFDemo {
	public static void main(String[] args)
	{
		Vector<Integer> v=new Vector<Integer>(3,2);
		System.out.println("Initial Size : "+v.size());
		System.out.println("Initial capacity : "+v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("Capacity after four additions : "+v.capacity());
		//v.addElement(new Double(6.06));
		v.addElement(new Integer(1));
		System.out.println("Current capacity : "+v.capacity());
		System.out.println("First Element : "+v.firstElement());
		System.out.println("LAst Element : "+v.lastElement());
		
	}

}

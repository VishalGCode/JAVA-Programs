package stringDemo;

public class StringDemo {
	public static void main (String[]  args)
	{
		String s1=new String();
		System.out.println(s1);
//		Integer i1= new Integer('h');
//		System.out.println(i1);  // will print ascii value
		String s2=new String("Hello");
		System.out.println(s2);
		char []c1= {'H','e','l','l','o'};
		String s3= new String(c1);
		System.out.println(s3);
		String s4="Bye";
		System.out.println(s4);
		String s5="Bye";
		System.out.println(s5);
		String s6=new String("Hello");
		System.out.println(s6);
		System.out.println("s1: "+ s1.hashCode());
		System.out.println("s2: "+ s2.hashCode());
		System.out.println("s3: "+ s3.hashCode());
		System.out.println("s4: "+ s4.hashCode());
		System.out.println("s5: "+ s5.hashCode());
		System.out.println("s6: "+ s6.hashCode());
		//comaprison
		System.out.println(s2==s6);
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s4==s5);
		/*String is immutable and string buffer is mutable..
		 * String s1=new String("Assignment");
		 * String s2=new String("Assignment");
		 * System.out.println(s1==s2); 
		 */
		//equals
		System.out.println(s2.equals(s6));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s4.equals(s5));
		
		
		}
	}

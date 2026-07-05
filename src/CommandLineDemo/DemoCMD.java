package CommandLineDemo;

class DemoCMD
{
public static void main (String[] a1)
{
	
	System.out.println("Command line arguments are : ");
	System.out.println("Length of String array is "+a1.length);
	for (int i=0;i<a1.length;i++)
	{
		System.out.println(a1[i]);
	}
}
}


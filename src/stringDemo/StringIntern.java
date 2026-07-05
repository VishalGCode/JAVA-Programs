package stringDemo;

public class StringIntern {
	public static void main(String [] args)
	{
		String s1=new String("Tom");
		String s2=s1.concat("Senior");
		/* There are three objects in scp Tom, Senior, TomSenior and one in heap i.e., TomSenior */
		String s3=s2; // s3 holds the address of s2 is copied
		System.out.println(s2==s3); //true
		String s4=s1;
		System.out.println(s4==s1);//true
		String s5=s1.intern(); // It holds the address from SCP
		System.out.println(s5==s1);//false
		String s6=s2;
		System.out.println(s6==s2);//true
		String s7=s2.intern();
		System.out.println(s7==s2);//true
		
	}

}

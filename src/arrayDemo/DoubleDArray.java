package arrayDemo;

public class DoubleDArray {
	int arr[][]=new int [5][2];
	void init()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<2;j++)
				arr[i][j]=i+3;
		}
	}
	void prn()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<2;j++)
				System.out.println(arr[i][j]);
		}
	}
	public static void main (String args[])
	{
		DoubleDArray dd= new DoubleDArray();
		dd.init();
		dd.prn();
	}
}
